package leetcode.legostin.hash_table

class MinimumRoundsCompleteAllTasks {

    fun minimumRounds(tasks: IntArray): Int {
        if (tasks.isEmpty()) return -1

        val levelToFrequency = HashMap<Int, Int>()
        for (task in tasks) {
            val frequency = levelToFrequency.getOrDefault(task, 0) + 1
            levelToFrequency[task] = frequency
        }

        var result = 0
        for (frequency in levelToFrequency.values) {
            if (frequency == 1) {
                return -1
            }
            if (frequency % 3 == 0) {
                result += frequency / 3
            } else {
                // If count % 3 = 1; (count / 3 - 1) groups of triplets and 2 pairs.
                // If count % 3 = 2; (count / 3) groups of triplets and 1 pair.
                result += (frequency / 3) + 1
            }
        }
        return result
    }
}
