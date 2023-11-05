package leetcode.legostin.sliding_window

/**
 * Заганяем указатель ближе к концу массива, на столько чтобы выполнялось условие sum >= target.
 * Потом уменьшаем длину subarray.
 */
class MinimumSizeSubarraySum {

    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var sum = 0
        var from = 0
        var result = Int.MAX_VALUE

        for (i in nums.indices) {
            sum += nums[i]
            while (sum >= target) {
                result = Math.min(result, i - from + 1)
                sum -= nums[from++]
            }
        }
        return if (result == Int.MAX_VALUE) 0 else result
    }
}
