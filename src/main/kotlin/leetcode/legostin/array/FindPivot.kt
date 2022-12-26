package leetcode.legostin.array

/**
 * The pivot index is the index where the sum of all the numbers
 * strictly to the left of the index is equal to the sum of all the numbers
 * strictly to the index's right.
 *
 * If the index is on the left edge of the array, then the left sum is 0
 * because there are no elements to the left.
 * This also applies to the right edge of the array.
 *
 * Return the leftmost pivot index. If no such index exists, return -1
 */
class FindPivot {

    fun pivotIndex(nums: IntArray): Int {
        val total = nums.sum()
        var sum = 0
        for (i in nums.indices) {
            if (sum * 2 == total - nums[i]) {
                return i
            }
            sum += nums[i]
        }
        return -1
    }
}
