package leetcode.legostin.two_pointers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TrappingRainWaterTest {

    private val target = TrappingRainWater()

    @Test
    fun test1() {
        val result = target.trap(height = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))
        assertThat(result).isEqualTo(6)
    }

    @Test
    fun test2() {
        val result = target.trap(height = intArrayOf(4, 2, 0, 3, 2, 5))
        assertThat(result).isEqualTo(9)
    }

    @Test
    fun test3() {
        val result = target.trap(height = intArrayOf(5, 4, 3, 2, 1))
        assertThat(result).isEqualTo(0)
    }
}
