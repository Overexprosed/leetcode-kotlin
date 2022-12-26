package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheDifferenceTest {

    private val target = FindTheDifference()

    @Test
    fun test1() {
        val result = target.findTheDifference("abcd", "abcde")
        assertEquals('e', result)
    }

    @Test
    fun test2() {
        val result = target.findTheDifference("", "y")
        assertEquals('y', result)
    }
}
