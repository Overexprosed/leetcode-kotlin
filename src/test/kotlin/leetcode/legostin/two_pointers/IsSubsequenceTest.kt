package leetcode.legostin.two_pointers

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class IsSubsequenceTest {

    private val target = IsSubsequence()

    @Test
    fun test1() {
        val result = target.isSubsequence("abc", "ahbgdc")
        assertTrue(result)
    }

    @Test
    fun test2() {
        val result = target.isSubsequence("axc", "ahbgdc")
        assertFalse(result)
    }

    @Test
    fun test3() {
        val result = target.isSubsequence("aabc", "ahatbgdc")
        assertTrue(result)
    }

    @Test
    fun test4() {
        val result = target.isSubsequence("ab", "baab")
        assertTrue(result)
    }
}
