package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class NextGreaterElementTest {

    private val target = NextGreaterElement()

    @Test
    fun test1() {
        val nums1 = intArrayOf(4, 1, 2)
        val nums2 = intArrayOf(1, 3, 4, 2)

        val result: IntArray = target.nextGreaterElement(nums1, nums2)
        assertArrayEquals(intArrayOf(-1, 3, -1), result)
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(2, 4)
        val nums2 = intArrayOf(1, 2, 3, 4)

        val result: IntArray = target.nextGreaterElement(nums1, nums2)
        assertArrayEquals(intArrayOf(3, -1), result)
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(137, 59, 92, 236)
        val nums2 = intArrayOf(137, 59, 92, 236)

        val result: IntArray = target.nextGreaterElement(nums1, nums2)
        assertArrayEquals(intArrayOf(236, 92, 236, -1), result)
    }
}
