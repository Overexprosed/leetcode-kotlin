package leetcode.legostin.sliding_window

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConstrainedSubsequenceSumTest {

    private val target = ConstrainedSubsequenceSum()

    @Test
    fun test1() {
        val result = target.constrainedSubsetSum(
            nums = intArrayOf(10, 2, -10, 5, 20),
            k = 2
        )
        assertThat(result).isEqualTo(37)
    }

    @Test
    fun test2() {
        val result = target.constrainedSubsetSum(
            nums = intArrayOf(-1, -2, -3),
            k = 1
        )
        assertThat(result).isEqualTo(-1)
    }

    @Test
    fun test3() {
        val result = target.constrainedSubsetSum(
            nums = intArrayOf(10, -2, -10, -5, 20),
            k = 2
        )
        assertThat(result).isEqualTo(23)
    }
}
