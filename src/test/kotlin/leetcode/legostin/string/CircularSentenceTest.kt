package leetcode.legostin.string

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CircularSentenceTest {

    private val target = CircularSentence()

    @Test
    fun test1() {
        target
            .isCircularSentence("leetcode exercises sound delightful")
            .also { assertThat(it).isTrue }
    }

    @Test
    fun test2() {
        target
            .isCircularSentence("eetcode")
            .also { assertThat(it).isTrue }
    }

    @Test
    fun test3() {
        target
            .isCircularSentence("Leetcode is cool")
            .also { assertThat(it).isFalse }
    }
}
