package leetcode.legostin.sliding_window

import java.util.TreeMap

class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit {

    fun longestSubarray(nums: IntArray, limit: Int): Int {
        var result = 0
        val window = TreeMap<Int, Int>()

        var left = 0
        for (right in nums.indices) {
            window[nums[right]] = window.getOrDefault(nums[right], 0) + 1

            while (window.lastKey() - window.firstKey() > limit) {
                window[nums[left]] = window[nums[left]]!! - 1

                if (window[nums[left]] == 0) {
                    window.remove(nums[left])
                }

                left++
            }
            result = Math.max(result, right - left + 1)
        }

        return result
    }
}
