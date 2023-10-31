package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReverseWordsInStringTest {

    private val target = ReverseWordsInString()

    @Test
    fun test1() {
        val result = target.reverseWords(s = "the sky is blue")
        assertThat(result).isEqualTo("blue is sky the")
    }

    @Test
    fun test2() {
        val result = target.reverseWords(s = "  hello world  ")
        assertThat(result).isEqualTo("world hello")
    }

    @Test
    fun test3() {
        val result = target.reverseWords(s = "a good   example")
        assertThat(result).isEqualTo("example good a")
    }
}
