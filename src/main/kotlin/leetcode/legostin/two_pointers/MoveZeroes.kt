package leetcode.legostin.two_pointers

/**
 * Given an integer array nums, move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 * Pointer 1: i
 * Pointer 2: insertPosition
 */
class MoveZeroes {

    fun moveZeroes(nums: IntArray) {
        var insertPosition = 0

        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[insertPosition] = nums[i]
                insertPosition++
            }
        }
        while (insertPosition < nums.size) {
            nums[insertPosition] = 0
            insertPosition++
        }
    }
}
