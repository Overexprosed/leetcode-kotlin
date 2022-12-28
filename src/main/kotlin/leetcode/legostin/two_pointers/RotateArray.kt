package leetcode.legostin.two_pointers

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
class RotateArray {

    fun rotate(nums: IntArray, k: Int) {
        if (nums.isEmpty()) return
        val rotate = k % nums.size

        reverse(nums, 0, nums.size - 1 - rotate)
        reverse(nums, nums.size - rotate, nums.size - 1)
        reverse(nums, 0, nums.size - 1)
    }

    private fun reverse(array: IntArray, i: Int, j: Int) {
        var first = i
        var second = j
        while (first < second) {
            val tmp = array[first]
            array[first] = array[second]
            array[second] = tmp
            first++
            second--
        }
    }
}
