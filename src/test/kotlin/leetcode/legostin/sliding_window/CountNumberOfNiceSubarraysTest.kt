package leetcode.legostin.sliding_window

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CountNumberOfNiceSubarraysTest {

    private val target = CountNumberOfNiceSubarrays()

    @Test
    fun test1() {
        target.numberOfSubarrays(nums = intArrayOf(1, 1, 2, 1, 1), k = 3).let {
            assertThat(it).isEqualTo(2)
        }
    }

    @Test
    fun test2() {
        target.numberOfSubarrays(nums = intArrayOf(2, 4, 6), k = 1).let {
            assertThat(it).isEqualTo(0)
        }
    }

    @Test
    fun test3() {
        target.numberOfSubarrays(nums = intArrayOf(2, 2, 2, 1, 2, 2, 1, 2, 2, 2), k = 2).let {
            assertThat(it).isEqualTo(16)
        }
    }
}
