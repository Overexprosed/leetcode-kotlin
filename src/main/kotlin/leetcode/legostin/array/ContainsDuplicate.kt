package leetcode.legostin.array

class ContainsDuplicate {

    fun containsDuplicate(nums: IntArray): Boolean {
        val set = HashSet<Int>(nums.size)

        nums.forEach { number ->
            if (!set.add(number)) {
                return true
            }
        }

        return false
    }
}
