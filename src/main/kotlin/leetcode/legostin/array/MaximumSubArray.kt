package leetcode.legostin.array

/**
 * Maximum Sub-array
 *
 * Given an integer array nums, find the contiguous sub-array (containing at least one number)
 * which has the largest sum and return its sum.
 *
 * Example 1:
 * Input  : nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output : 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * ---
 * Algorithm created by Jon Bentley (Sep. 1984).
 * It's like a snowball.
 */
class MaximumSubArray {

    fun maxSubArray(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var maxEndingHere = nums[0]
        var maxSoFar = nums[0]

        for (i in 1 until nums.size) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i])
            maxSoFar = Math.max(maxSoFar, maxEndingHere)
        }
        return maxSoFar
    }
}
