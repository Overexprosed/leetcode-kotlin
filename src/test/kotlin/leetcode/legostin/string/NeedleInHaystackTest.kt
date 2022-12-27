package leetcode.legostin.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NeedleInHaystackTest {

    private val target = NeedleInHaystack()

    @Test
    fun test1() {
        assertEquals(2, target.strStr("hello", "ll"))
    }

    @Test
    fun test2() {
        assertEquals(0, target.strStr("hello", ""))
    }

    @Test
    fun test3() {
        assertEquals(-1, target.strStr("haystackNeedle", "needle"))
    }

    @Test
    fun test4() {
        assertEquals(8, target.strStr("haystackNeedle", "Needle"))
    }

    @Test
    fun test5() {
        assertEquals(4, target.strStr("mississipi", "issip"))
    }

    @Test
    fun test6() {
        assertEquals(-1, target.strStr("aaa", "aaaa"))
    }

    @Test
    fun test7() {
        assertEquals(-1, target.strStr("mississippi", "issipi"))
    }

    @Test
    fun test8() {
        assertEquals(0, target.strStr("a", "a"))
    }
}