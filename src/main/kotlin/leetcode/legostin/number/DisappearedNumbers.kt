package leetcode.legostin.number

import kotlin.math.abs

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 */
class DisappearedNumbers {

    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        for (i in nums.indices) {
            val value = abs(nums[i])
            val index = value - 1
            var markedValue = nums[index] // can be already marked
            if (markedValue < 0) {
                continue // already marked
            }
            markedValue *= -1
            nums[index] = markedValue
        }

        val result = mutableListOf<Int>()
        for (i in nums.indices) {
            val value = nums[i]
            if (value > 0) {
                result.add(i + 1)
            }
        }
        return result
    }
}
