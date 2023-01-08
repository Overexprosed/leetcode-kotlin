package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxPointsOnLineTest {

    private val target = MaxPointsOnLine()

    @Test
    fun test1() {
        val points = arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3))
        val result = target.maxPoints(points)
        assertEquals(3, result)
    }

    @Test
    fun test2() {
        val points = arrayOf(intArrayOf(1, 1), intArrayOf(3, 2), intArrayOf(4, 1), intArrayOf(2, 3), intArrayOf(1, 4))
        val result = target.maxPoints(points)
        assertEquals(4, result)
    }
}
