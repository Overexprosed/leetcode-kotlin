package leetcode.legostin.binary_search

/**
 * Search Insert Position
 *
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 */
class SearchInsertPosition {

    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return 0

        var low = 0
        var high = nums.size - 1
        var index = 0
        while (low <= high) {
            val mid = low + ((high - low) / 2)
            index = mid

            if (nums[mid] < target) {
                low = mid + 1
            } else if (nums[mid] > target) {
                high = mid - 1
            } else {
                return index
            }
        }
        return if (target < nums[index]) index else ++index
    }
}
