package leetcode.legostin.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindPivotTest {

    private val target = FindPivot()

    @Test
    fun test1() {
        val result = target.pivotIndex(intArrayOf(2, -1, 1))
        assertEquals(0, result)
    }

    @Test
    fun test2() {
        val result = target.pivotIndex(intArrayOf(1, 2, 3))
        assertEquals(-1, result)
    }

    @Test
    fun test3() {
        val result = target.pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6))
        assertEquals(3, result)
    }

    @Test
    fun test4() {
        val result = target.pivotIndex(intArrayOf(-1, -1, 0, 1, 1, 0))
        assertEquals(5, result)
    }
}
