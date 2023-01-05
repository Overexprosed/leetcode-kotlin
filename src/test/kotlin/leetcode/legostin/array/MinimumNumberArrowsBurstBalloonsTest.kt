package leetcode.legostin.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberArrowsBurstBalloonsTest {

    private val target = MinimumNumberArrowsBurstBalloons()

    @Test
    fun test1() {
        val points = arrayOf(intArrayOf(10, 16), intArrayOf(2, 8), intArrayOf(1, 6), intArrayOf(7, 12))
        val result = target.findMinArrowShots(points)
        assertEquals(2, result)
    }

    @Test
    fun test2() {
        val points = arrayOf(intArrayOf(1, 7), intArrayOf(3, 7), intArrayOf(5, 7), intArrayOf(6, 7))
        val result = target.findMinArrowShots(points)
        assertEquals(1, result)
    }

    @Test
    fun test3() {
        val points = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5))
        val result = target.findMinArrowShots(points)
        assertEquals(2, result)
    }
}
