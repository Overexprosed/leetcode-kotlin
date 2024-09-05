package leetcode.legostin.sliding_window

class CountNumberOfNiceSubarrays {

    fun numberOfSubarrays(nums: IntArray, k: Int): Int {
        var result = 0

        var left = 0
        var middle = 0
        var odd = 0

        for (right in nums) {
            if (right % 2 != 0) {
                odd++
            }

            while (odd > k) {
                if (nums[left] % 2 != 0) {
                    odd--
                }
                left++
                middle = left
            }

            if (odd == k) {
                while (nums[middle] % 2 == 0) {
                    middle++
                }
                result += (middle - left) + 1
            }
        }

        return result
    }
}
