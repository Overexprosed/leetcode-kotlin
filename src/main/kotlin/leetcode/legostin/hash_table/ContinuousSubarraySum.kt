package leetcode.legostin.hash_table

class ContinuousSubarraySum {

    /**
     * Если в reminderToIndex встречается тот же reminder,
     * значит мы прошлись по последовательности (или одному числу) которая равна k.
     *
     * [23, 2, 4], k = 6 -> 5, 1, 5 ->
     */
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val reminderToIndex = mutableMapOf<Int, Int>()
        reminderToIndex[0] = -1

        var sum = 0

        for (i in nums.indices) {
            sum += nums[i]
            val currentReminder = sum % k

            if (!reminderToIndex.containsKey(currentReminder)) {
                reminderToIndex[currentReminder] = i
            } else if (i - reminderToIndex[currentReminder]!! >= 2) {
                return true
            }
        }

        return false
    }
}
