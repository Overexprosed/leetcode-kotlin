package leetcode.legostin.string

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LongestPalindromicSubstringTest {

    private val target = LongestPalindromicSubstring()

    @Test
    fun test1() {
        val result = target.longestPalindrome(s = "babad")
        assertThat(result).isEqualTo("bab")
    }

    @Test
    fun test2() {
        val result = target.longestPalindrome(s = "cbbd")
        assertThat(result).isEqualTo("bb")
    }
}
