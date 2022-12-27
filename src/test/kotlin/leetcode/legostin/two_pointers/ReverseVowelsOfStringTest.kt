package leetcode.legostin.two_pointers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseVowelsOfStringTest {

    private val target = ReverseVowelsOfString()

    @Test
    fun test1() {
        val result = target.reverseVowels("hello")
        assertEquals("holle", result)
    }

    @Test
    fun test2() {
        val result = target.reverseVowels("leetcode")
        assertEquals("leotcede", result)
    }

    @Test
    fun test3() {
        val result = target.reverseVowels("")
        assertEquals("", result)
    }

    @Test
    fun test4() {
        val result = target.reverseVowels("hh")
        assertEquals("hh", result)
    }
}
