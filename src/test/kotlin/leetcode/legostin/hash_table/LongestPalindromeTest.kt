package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestPalindromeTest {

    private val target = LongestPalindrome()

    @Test
    fun test1() {
        val result = target.longestPalindrome("abccccdd")
        assertEquals(7, result)
    }
}
