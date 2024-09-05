package leetcode.legostin.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PassThePillowTest {

    private val target = PassThePillow()

    @Test
    fun test1() {
        target.passThePillow(n = 4, time = 5).let {
            assertThat(it).isEqualTo(2)
        }
    }

    @Test
    fun test2() {
        target.passThePillow(n = 3, time = 2).let {
            assertThat(it).isEqualTo(3)
        }
    }

    @Test
    fun test3() {
        target.passThePillow(n = 4, time = 7).let {
            assertThat(it).isEqualTo(2)
        }
    }
}
