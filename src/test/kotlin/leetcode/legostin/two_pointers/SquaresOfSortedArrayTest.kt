package leetcode.legostin.two_pointers

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SquaresOfSortedArrayTest {

    private val target = SquaresOfSortedArray()

    @Test
    fun test1() {
        val result = target.sortedSquares(intArrayOf(-4, -1, 0, 3, 10))
        assertArrayEquals(intArrayOf(0, 1, 9, 16, 100), result)
    }

    @Test
    fun test2() {
        val result = target.sortedSquares(intArrayOf(-7, -3, 2, 3, 11))
        assertArrayEquals(intArrayOf(4, 9, 9, 49, 121), result)
    }
}
