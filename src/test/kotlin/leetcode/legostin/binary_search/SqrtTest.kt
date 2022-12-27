package leetcode.legostin.binary_search

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidPerfectSquareTest {

    private val target = ValidPerfectSquare()

    @Test
    fun test1() {
        val result = target.isPerfectSquare(16)
        assertTrue(result)
    }

    @Test
    fun test2() {
        val result = target.isPerfectSquare(14)
        assertFalse(result)
    }

    @Test
    fun test3() {
        val result = target.isPerfectSquare(1)
        assertTrue(result)
    }

    @Test
    fun test4() {
        val result = target.isPerfectSquare(9)
        assertTrue(result)
    }
}
