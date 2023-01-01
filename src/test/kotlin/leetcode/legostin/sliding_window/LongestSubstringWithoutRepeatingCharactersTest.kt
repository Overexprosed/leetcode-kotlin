package leetcode.legostin.sliding_window

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestSubstringWithoutRepeatingCharactersTest {

    private val target = LongestSubstringWithoutRepeatingCharacters()

    @Test
    fun test1() {
        val s = "abcabcbb"
        val result = target.lengthOfLongestSubstring(s)
        assertEquals(3, result)
    }

    @Test
    fun test2() {
        val s = "bbb"
        val result = target.lengthOfLongestSubstring(s)
        assertEquals(1, result)
    }

    @Test
    fun test3() {
        val s = "pwwkew"
        val result = target.lengthOfLongestSubstring(s)
        assertEquals(3, result)
    }

    @Test
    fun test4() {
        val s = "abc"
        val result = target.lengthOfLongestSubstring(s)
        assertEquals(3, result)
    }

    @Test
    fun test5() {
        val s = ""
        val result = target.lengthOfLongestSubstring(s)
        assertEquals(0, result)
    }

    @Test
    fun test6() {
        val s = "abba"
        val result = target.lengthOfLongestSubstring(s)
        assertEquals(2, result)
    }
}
