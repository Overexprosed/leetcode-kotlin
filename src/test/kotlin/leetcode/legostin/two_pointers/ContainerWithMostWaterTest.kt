package leetcode.legostin.two_pointers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContainerWithMostWaterTest {

    private val target = ContainerWithMostWater()

    @Test
    fun test1() {
        val result = target.maxArea(height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))
        assertThat(result).isEqualTo(49)
    }

    @Test
    fun test2() {
        val result = target.maxArea(height = intArrayOf(1, 1))
        assertThat(result).isEqualTo(1)
    }
}
