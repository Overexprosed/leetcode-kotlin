package leetcode.legostin.dynamic_programming

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinCostClimbingStairsTest {

    private val target = MinCostClimbingStairs()

    @Test
    fun test1() {
        val result = target.minCostClimbingStairs(cost = intArrayOf(10, 15, 20))
        assertThat(result).isEqualTo(15)
    }

    @Test
    fun test2() {
        val result = target.minCostClimbingStairs(cost = intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1))
        assertThat(result).isEqualTo(6)
    }
}
