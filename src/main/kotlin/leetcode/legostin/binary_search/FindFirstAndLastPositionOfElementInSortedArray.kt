package leetcode.legostin.binary_search

class FindFirstAndLastPositionOfElementInSortedArray {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        val left = binarySearch(nums, target, true)
        val right = binarySearch(nums, target, false)
        return intArrayOf(left, right)
    }

    private fun binarySearch(nums: IntArray, target: Int, leftBias: Boolean): Int {
        var result = -1

        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val middle = left + ((right - left) / 2)

            if (nums[middle] < target) {
                left++
            } else if (nums[middle] > target) {
                right--
            } else {
                result = middle
                if (leftBias) {
                    right--
                } else {
                    left++
                }
            }
        }
        return result
    }
}
