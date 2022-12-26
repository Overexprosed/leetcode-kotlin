package leetcode.legostin.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LengthOfLastWordTest {

    private val target = LengthOfLastWord()

    @Test
    fun test1() {
        val result = target.lengthOfLastWord("Hello World")
        assertEquals(5, result)
    }

    @Test
    fun test2() {
        val result = target.lengthOfLastWord("   fly me   to   the moon  ")
        assertEquals(4, result)
    }

    @Test
    fun test3() {
        val result = target.lengthOfLastWord("luffy is still joyboy")
        assertEquals(6, result)
    }
}