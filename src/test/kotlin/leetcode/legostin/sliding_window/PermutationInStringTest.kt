package leetcode.legostin.sliding_window

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PermutationInStringTest {

    private val target = PermutationInString()

    @Test
    fun test1() {
        val output = target.checkInclusion("ab", "eidbaooo")
        assertTrue(output)
    }

    @Test
    fun test2() {
        val output = target.checkInclusion("ab", "eidboaoo")
        assertFalse(output)
    }

    @Test
    fun test3() {
        val output = target.checkInclusion("abcdxabcde", "abcdeabcdx")
        assertTrue(output)
    }
}
