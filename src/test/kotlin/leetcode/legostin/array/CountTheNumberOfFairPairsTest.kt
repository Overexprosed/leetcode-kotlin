package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CountTheNumberOfFairPairsTest {

    private val target = CountTheNumberOfFairPairs()

    @Test
    fun test1() {
        val result = target.countFairPairs(
            nums = intArrayOf(0, 1, 7, 4, 4, 5),
            lower = 3,
            upper = 6
        )

        assertThat(result).isEqualTo(6)
    }

    @Test
    fun test2() {
        val result = target.countFairPairs(
            nums = intArrayOf(1, 7, 9, 2, 5),
            lower = 11,
            upper = 11
        )

        assertThat(result).isEqualTo(1)
    }
}
