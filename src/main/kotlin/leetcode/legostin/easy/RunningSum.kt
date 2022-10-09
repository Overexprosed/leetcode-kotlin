package leetcode.legostin.easy

class RunningSum {

    fun runningSum(nums: IntArray): IntArray {
        val result = nums.copyOf()
        for (i in 1 until result.size) {
            result[i] = result[i - 1] + result[i]
        }
        return result
    }
}
