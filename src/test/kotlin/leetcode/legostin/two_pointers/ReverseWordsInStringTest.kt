package leetcode.legostin.two_pointers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseWordsInStringTest {

    private val target = ReverseWordsInString()

    @Test
    fun test1() {
        val output = target.reverseWords("Let's take LeetCode contest")
        assertEquals("s'teL ekat edoCteeL tsetnoc", output)
    }

    @Test
    fun test2() {
        val output = target.reverseWords("God Ding")
        assertEquals("doG gniD", output)
    }

    @Test
    fun test3() {
        val output = target.reverseWords("")
        assertEquals("", output)
    }

    @Test
    fun test4() {
        val output = target.reverseWords("god")
        assertEquals("dog", output)
    }

    @Test
    fun test5() {
        val output = target.reverseWords("God Ding ")
        assertEquals("doG gniD ", output)
    }
}
