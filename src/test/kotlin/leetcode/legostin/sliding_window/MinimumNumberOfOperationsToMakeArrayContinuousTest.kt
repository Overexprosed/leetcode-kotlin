package leetcode.legostin.sliding_window

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinimumNumberOfOperationsToMakeArrayContinuousTest {

    private val target = MinimumNumberOfOperationsToMakeArrayContinuous()

    @Test
    fun test1() {
        val result = target.minOperations(nums = intArrayOf(4, 2, 5, 3))
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun test2() {
        val result = target.minOperations(nums = intArrayOf(1, 2, 3, 5, 6))
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun test3() {
        val result = target.minOperations(nums = intArrayOf(1, 10, 100, 1000))
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun test4() {
        val result = target.minOperations(nums = intArrayOf(8, 5, 9, 9, 8, 4))
        assertThat(result).isEqualTo(2)
    }
}
