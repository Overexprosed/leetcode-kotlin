package leetcode.legostin.array

@Suppress("unused")
class ContainsDuplicate {

    /**
     * HashSet approach.
     */
    fun containsDuplicate1(nums: IntArray): Boolean {
        val set = HashSet<Int>(nums.size)

        nums.forEach { number ->
            if (!set.add(number)) {
                return true
            }
        }

        return false
    }

    /**
     * HashMap approach.
     */
    fun containsDuplicate2(nums: IntArray): Boolean {
        val map = HashMap<Int, Int>()

        nums.forEach { number ->
            val count = map.getOrDefault(number, 0)

            if (count == 1) {
                return true
            }

            map[number] = count + 1
        }

        return false
    }
}
