package leetcode.legostin.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumberOfGoodPairsTest {

    private val target = NumberOfGoodPairs()

    @Test
    fun test1() {
        val result = target.numIdenticalPairs(nums = intArrayOf(1, 2, 3, 1, 1, 3))
        assertThat(result).isEqualTo(4)
    }

    @Test
    fun test2() {
        val result = target.numIdenticalPairs(nums = intArrayOf(1, 1, 1, 1))
        assertThat(result).isEqualTo(6)
    }

    @Test
    fun test3() {
        val result = target.numIdenticalPairs(nums = intArrayOf(1, 2, 3))
        assertThat(result).isEqualTo(0)
    }
}
