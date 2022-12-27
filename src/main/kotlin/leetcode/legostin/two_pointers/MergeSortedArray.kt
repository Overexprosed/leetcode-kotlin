package leetcode.legostin.two_pointers

/**
 * Merge Sorted Array
 *
 * Input  : nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output : [1,2,2,3,5,6]
 *
 * ---
 * O(m + n)
 */
class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var tailIndex1 = m - 1
        var tailIndex2 = n - 1
        var finishIndex = m + n - 1

        while (tailIndex1 >= 0 && tailIndex2 >= 0) {
            val tailNumber1 = nums1[tailIndex1]
            val tailNumber2 = nums2[tailIndex2]
            var finishNumber: Int

            if (tailNumber1 > tailNumber2) {
                finishNumber = tailNumber1
                tailIndex1--
            } else {
                finishNumber = tailNumber2
                tailIndex2--
            }
            nums1[finishIndex] = finishNumber
            finishIndex--
        }
        // case when nums1 is empty
        // combine with remaining nums2
        while (tailIndex2 >= 0) {
            nums1[finishIndex] = nums2[tailIndex2]
            tailIndex2--
            finishIndex--
        }
    }
}
