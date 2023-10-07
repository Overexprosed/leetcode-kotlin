package leetcode.legostin.dynamic_programming

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntegerBreakTest {

    private val target = IntegerBreak()

    @Test
    fun test1() {
        val result = target.integerBreak(2)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun test2() {
        val result = target.integerBreak(10)
        assertThat(result).isEqualTo(36)
    }
}
