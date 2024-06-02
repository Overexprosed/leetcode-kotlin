package leetcode.legostin.string

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoreOfStringTest {

    private val target = ScoreOfString()

    @Test
    fun test1() {
        target.scoreOfString(s = "zaz").let {
            assertThat(it).isEqualTo(50)
        }
    }

    @Test
    fun test2() {
        target.scoreOfString(s = "hello").let {
            assertThat(it).isEqualTo(13)
        }
    }

    @Test
    fun test3() {
        target.scoreOfString(s = "").let {
            assertThat(it).isEqualTo(0)
        }
    }
}
