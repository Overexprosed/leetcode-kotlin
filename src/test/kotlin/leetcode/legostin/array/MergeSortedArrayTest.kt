package leetcode.legostin.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MergeSortedArrayTest {

    private val target = MergeSortedArray()

    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 2, 3, 0)
        val nums2 = intArrayOf(2)

        target.merge(nums1, 3, nums2, 1)
        assertArrayEquals(intArrayOf(1, 2, 2, 3), nums1)
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(0)
        val nums2 = intArrayOf(1)

        target.merge(nums1, 0, nums2, 1)
        assertArrayEquals(intArrayOf(1), nums1)
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(10)
        val nums2 = intArrayOf(0)

        target.merge(nums1, 1, nums2, 0)
        assertArrayEquals(intArrayOf(10), nums1)
    }

    @Test
    fun test4() {
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val nums2 = intArrayOf(2, 5, 6)

        target.merge(nums1, 3, nums2, 3)
        assertArrayEquals(intArrayOf(1, 2, 2, 3, 5, 6), nums1)
    }
}
