package leetcode.legostin.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PowerOfFourTest {

    private val target = PowerOfFour()

    @Test
    fun test1() {
        val result = target.isPowerOfFour(n = 16)
        assertThat(result).isTrue
    }
}
