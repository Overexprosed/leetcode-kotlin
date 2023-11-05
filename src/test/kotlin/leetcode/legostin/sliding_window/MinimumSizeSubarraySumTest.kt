package leetcode.legostin.sliding_window

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinimumSizeSubarraySumTest {

    private val target = MinimumSizeSubarraySum()

    @Test
    fun test1() {
        val result = target.minSubArrayLen(nums = intArrayOf(2, 3, 1, 2, 4, 3), target = 7)
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun test2() {
        val result = target.minSubArrayLen(nums = intArrayOf(1, 4, 4), target = 4)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun test3() {
        val result = target.minSubArrayLen(nums = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1), target = 11)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun test4() {
        val result = target.minSubArrayLen(nums = intArrayOf(1, 2, 3, 4, 5), target = 11)
        assertThat(result).isEqualTo(3)
    }
}
