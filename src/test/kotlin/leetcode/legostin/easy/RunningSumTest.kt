package leetcode.legostin.easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RunningSumTest {

    private val target = RunningSum()

    @Test
    fun test1() {
        val result = target.runningSum(intArrayOf(1, 2, 3, 4))
        assertArrayEquals(result, intArrayOf(1, 3, 6, 10))
    }

    @Test
    fun test2() {
        val result = target.runningSum(intArrayOf(1, 1, 1, 1, 1))
        assertArrayEquals(result, intArrayOf(1, 2, 3, 4, 5))
    }

    @Test
    fun test3() {
        val result = target.runningSum(intArrayOf(3, 1, 2, 10, 1))
        assertArrayEquals(result, intArrayOf(3, 4, 6, 16, 17))
    }

    @Test
    fun test4() {
        val result = target.runningSum(intArrayOf())
        assertTrue(result.isEmpty())
    }

    @Test
    fun test5() {
        val result = target.runningSum(intArrayOf(1))
        assertArrayEquals(result, intArrayOf(1))
    }
}
