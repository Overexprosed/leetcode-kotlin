package leetcode.legostin.easy

/**
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
class RunningSum {

    fun runningSum(nums: IntArray): IntArray {
        val result = nums.copyOf()
        for (i in 1 until result.size) {
            result[i] = result[i - 1] + result[i]
        }
        return result
    }
}
