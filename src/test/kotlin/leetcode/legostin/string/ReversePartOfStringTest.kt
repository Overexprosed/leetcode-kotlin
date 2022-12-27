package leetcode.legostin.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ReversePartOfStringTest {

    private val target = ReversePartOfString()

    @Test
    fun test1() {
        val output = target.reverseStr("", 10)
        assertTrue(output.isEmpty())
    }

    @Test
    fun test2() {
        val output = target.reverseStr("abcd", 2)
        assertEquals("bacd", output)
    }

    @Test
    fun test3() {
        val output = target.reverseStr("abcdefg", 2)
        assertEquals("bacdfeg", output)
    }

    @Test
    fun test4() {
        val output = target.reverseStr("ab", 2)
        assertEquals("ba", output)
    }

    @Test
    fun test5() {
        val output = target.reverseStr("abc", 2)
        assertEquals("bac", output)
    }

    @Test
    fun test6() {
        val output = target.reverseStr("abc", 1)
        assertEquals("abc", output)
    }

    @Test
    fun test7() {
        val output = target.reverseStr("abc", 4)
        assertEquals("cba", output)
    }
}
