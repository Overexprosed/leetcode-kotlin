package leetcode.legostin.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumSubArrayTest {

    private val target = MaximumSubArray()

    @Test
    fun test1() {
        val nums = intArrayOf(1)
        val result = target.maxSubArray(nums)
        assertEquals(1, result)
    }

    @Test
    fun test2() {
        val nums = intArrayOf()
        val result = target.maxSubArray(nums)
        assertEquals(0, result)
    }

    @Test
    fun test3() {
        val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        val result = target.maxSubArray(nums)
        assertEquals(6, result)
    }

    @Test
    fun test4() {
        val nums = intArrayOf(5, 4, -1, 7, 8)
        val result = target.maxSubArray(nums)
        assertEquals(23, result)
    }
}
