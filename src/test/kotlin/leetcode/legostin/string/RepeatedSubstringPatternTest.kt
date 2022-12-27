package leetcode.legostin.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class RepeatedSubstringPatternTest {

    private val target = RepeatedSubstringPattern()

    @Test
    fun test1() {
        assertTrue(target.repeatedSubstringPattern("abab"))
    }

    @Test
    fun test2() {
        assertFalse(target.repeatedSubstringPattern("aba"))
    }

    @Test
    fun test3() {
        assertTrue(target.repeatedSubstringPattern("abcabcabcabc"))
    }

    @Test
    fun test4() {
        assertTrue(target.repeatedSubstringPattern("bb"))
    }
}
