package leetcode.legostin.number

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PalindromeNumberTest {

    private val target = PalindromeNumber()

    @Test
    fun test1() {
        assertTrue(target.isPalindrome(121))
    }

    @Test
    fun test2() {
        assertFalse(target.isPalindrome(-121))
    }

    @Test
    fun test3() {
        assertTrue(target.isPalindrome(0))
    }

    @Test
    fun test4() {
        assertFalse(target.isPalindrome(Int.MAX_VALUE))
    }

    @Test
    fun test5() {
        assertFalse(target.isPalindrome(Int.MIN_VALUE))
    }
}
