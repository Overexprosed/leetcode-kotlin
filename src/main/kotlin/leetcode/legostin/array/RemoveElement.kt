@file:Suppress("unused")

package leetcode.legostin.array

class RemoveElement {

    fun removeElement(nums: IntArray, value: Int): Int {
        var newLength = 0

        nums.indices.forEach { i ->
            if (nums[i] != value) {
                nums[newLength++] = nums[i]
            }
        }

        return newLength
    }
}
