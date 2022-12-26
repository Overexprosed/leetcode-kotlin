package leetcode.legostin.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestCommonPrefixTest {

    private val target = LongestCommonPrefix()

    @Test
    fun test1() {
        val strings = arrayOf("flower", "flow", "flight")
        assertEquals("fl", target.longestCommonPrefix(strings))
    }

    @Test
    fun test2() {
        val strings = arrayOf("dog", "racecar", "car")
        assertEquals("", target.longestCommonPrefix(strings))
    }

    @Test
    fun test3() {
        val strings = arrayOf<String>()
        assertEquals("", target.longestCommonPrefix(strings))
    }

    @Test
    fun test4() {
        val strings = arrayOf("a")
        assertEquals("a", target.longestCommonPrefix(strings))
    }

    @Test
    fun test5() {
        val strings = arrayOf("flower", "flower")
        assertEquals("flower", target.longestCommonPrefix(strings))
    }

    @Test
    fun test6() {
        val strings = arrayOf("fffff", "fffff")
        assertEquals("fffff", target.longestCommonPrefix(strings))
    }

    @Test
    fun test7() {
        val strings = arrayOf("", "")
        assertEquals("", target.longestCommonPrefix(strings))
    }

    @Test
    fun test8() {
        val strings = arrayOf("", "", "s")
        assertEquals("", target.longestCommonPrefix(strings))
    }

    @Test
    fun test9() {
        val strings = arrayOf("aaa", "aa", "aaa")
        assertEquals("aa", target.longestCommonPrefix(strings))
    }
}
