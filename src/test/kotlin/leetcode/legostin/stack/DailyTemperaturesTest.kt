package leetcode.legostin.stack

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DailyTemperaturesTest {

    private val target = DailyTemperatures()

    @Test
    fun test1() {
        val result = target.dailyTemperatures(temperatures = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73))

        val expected = intArrayOf(1, 1, 4, 2, 1, 1, 0, 0)
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun test2() {
        val result = target.dailyTemperatures(temperatures = intArrayOf(30, 40, 50, 60))

        val expected = intArrayOf(1, 1, 1, 0)
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun test3() {
        val result = target.dailyTemperatures(temperatures = intArrayOf(30, 60, 90))

        val expected = intArrayOf(1, 1, 0)
        assertThat(result).isEqualTo(expected)
    }
}
