package leetcode.legostin.easy

class FindPivot {

    fun pivotIndex(nums: IntArray): Int {
        val total = nums.sum()
        var sum = 0
        for (i in nums.indices) {
            if (sum * 2 == total - nums[i]) {
                return i
            }
            sum += nums[i]
        }
        return -1
    }
}
