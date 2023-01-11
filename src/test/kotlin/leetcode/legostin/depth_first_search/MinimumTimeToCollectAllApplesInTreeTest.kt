package leetcode.legostin.depth_first_search

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumTimeToCollectAllApplesInTreeTest {

    private val target = MinimumTimeToCollectAllApplesInTree()

    @Test
    fun test1() {
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
            intArrayOf(2, 3),
            intArrayOf(2, 6)
        )
        val hasApple = listOf(false, false, true, false, true, true, false)
        val result = target.minTime(7, edges, hasApple)
        assertEquals(8, result)
    }

    @Test
    fun test2() {
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
            intArrayOf(2, 3),
            intArrayOf(2, 6)
        )
        val hasApple = listOf(false, false, true, false, false, true, false)
        val result = target.minTime(7, edges, hasApple)
        assertEquals(6, result)
    }

    @Test
    fun test3() {
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
            intArrayOf(2, 3),
            intArrayOf(2, 6)
        )
        val hasApple = listOf(false, false, false, false, false, false, false)
        val result = target.minTime(7, edges, hasApple)
        assertEquals(0, result)
    }
}
