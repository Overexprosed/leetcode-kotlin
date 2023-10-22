package leetcode.legostin.two_pointers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaximumScoreOfGoodSubarrayTest {

    private val target = MaximumScoreOfGoodSubarray()

    @Test
    fun test1() {
        val result = target.maximumScore(
            nums = intArrayOf(1, 4, 3, 7, 4, 5),
            k = 3
        )
        assertThat(result).isEqualTo(15)
    }

    @Test
    fun test2() {
        val result = target.maximumScore(
            nums = intArrayOf(5, 5, 4, 5, 4, 1, 1, 1),
            k = 0
        )
        assertThat(result).isEqualTo(20)
    }
}
