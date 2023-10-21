package leetcode.legostin.sliding_window

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SlidingWindowMaximumTest {

    private val target = SlidingWindowMaximum()

    @Test
    fun test1() {
        val result = target.maxSlidingWindow(
            nums = intArrayOf(1, 3, -1, -3, 5, 3, 6, 7),
            k = 3
        )
        val expected = intArrayOf(3, 3, 5, 5, 6, 7)

        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun test2() {
        val result = target.maxSlidingWindow(
            nums = intArrayOf(1),
            k = 1
        )
        val expected = intArrayOf(1)

        assertThat(result).isEqualTo(expected)
    }
}
