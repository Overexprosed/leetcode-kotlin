package leetcode.legostin.two_pointers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ValidPalindromeTest {

    private val target = ValidPalindrome()

    @Test
    fun test1() {
        val result = target.isPalindrome("A man, a plan, a canal: Panama")
        assertThat(result).isTrue
    }

    @Test
    fun test2() {
        val result = target.isPalindrome("race a car")
        assertThat(result).isFalse
    }

    @Test
    fun test3() {
        val result = target.isPalindrome(" ")
        assertThat(result).isTrue
    }

    @Test
    fun test4() {
        val result = target.isPalindrome("")
        assertThat(result).isTrue
    }
}
