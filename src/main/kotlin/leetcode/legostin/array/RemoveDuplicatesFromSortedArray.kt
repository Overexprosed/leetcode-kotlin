@file:Suppress("unused")

package leetcode.legostin.array

class RemoveDuplicatesFromSortedArray {

    fun removeDuplicates(nums: IntArray): Int {
        var j = 0

        for (i in nums.indices) {
            if (i < nums.size - 1 && nums[i] == nums[i + 1]) {
                continue
            }
            nums[j++] = nums[i]
        }

        return j
    }
}
