package leetcode.legostin.number

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BestTimeToBuyAndSellStockTest {

    private val target = BestTimeToBuyAndSellStock()

    @Test
    fun test1() {
        val result = target.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
        assertEquals(result, 5)
    }
}
