package leetcode.legostin.two_pointers

import kotlin.math.abs

/**
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 *
 * Array is already sorted.
 * We are comparing the first and last elements
 * because after square these have the possibility of being the highest element.
 * Both the extremes contain the max element (after square),
 * so we are inserting these elements to the last of the new array to make it sorted.
 */
class SquaresOfSortedArray {

    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        var i = 0
        var j = nums.size - 1
        for (p in nums.size - 1 downTo 0) {
            if (abs(nums[i]) > abs(nums[j])) {
                result[p] = nums[i] * nums[i]
                i++
            } else {
                result[p] = nums[j] * nums[j]
                j--
            }
        }
        return result
    }
}
