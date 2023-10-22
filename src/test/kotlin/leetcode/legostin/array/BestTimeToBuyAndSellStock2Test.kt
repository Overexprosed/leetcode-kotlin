package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BestTimeToBuyAndSellStock2Test {

    private val target = BestTimeToBuyAndSellStock2()

    @Test
    fun test1() {
        val result = target.maxProfit(prices = intArrayOf(7, 1, 5, 3, 6, 4))
        assertThat(result).isEqualTo(7)
    }

    @Test
    fun test2() {
        val result = target.maxProfit(prices = intArrayOf(1, 2, 3, 4, 5))
        assertThat(result).isEqualTo(4)
    }

    @Test
    fun test3() {
        val result = target.maxProfit(prices = intArrayOf(7, 6, 4, 3, 1))
        assertThat(result).isEqualTo(0)
    }
}
