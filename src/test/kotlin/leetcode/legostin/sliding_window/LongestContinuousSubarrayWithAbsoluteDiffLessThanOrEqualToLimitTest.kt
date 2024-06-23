package leetcode.legostin.sliding_window

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimitTest {

    private val target = LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit()

    @Test
    fun test1() {
        target.longestSubarray(
            nums = intArrayOf(8, 2, 4, 7),
            limit = 4
        ).let {
            assertThat(it).isEqualTo(2)
        }
    }

    @Test
    fun test2() {
        target.longestSubarray(
            nums = intArrayOf(10, 1, 2, 4, 7, 2),
            limit = 5
        ).let {
            assertThat(it).isEqualTo(4)
        }
    }

    @Test
    fun test3() {
        target.longestSubarray(
            nums = intArrayOf(4, 2, 2, 2, 4, 4, 2, 2),
            limit = 0
        ).let {
            assertThat(it).isEqualTo(3)
        }
    }
}
