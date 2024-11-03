package leetcode.legostin.string

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RotateStringTest {

    private val target = RotateString()

    @Test
    fun test1() {
        target.rotateString(s = "abcde", goal = "cdeab").also { assertThat(it).isTrue }
    }

    @Test
    fun test2() {
        target.rotateString(s = "abcde", goal = "abced").also { assertThat(it).isFalse }
    }
}
