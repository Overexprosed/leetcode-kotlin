package leetcode.legostin.binary_search

class BinarySearch {

    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) {
            return -1
        }
        var high = nums.size - 1
        var low = 0

        while (low <= high) {
            val middle = low + ((high - low) / 2)

            if (nums[middle] < target) {
                low = middle + 1
            } else if (nums[middle] > target) {
                high = middle - 1
            } else {
                return middle
            }
        }
        return -1
    }
}
