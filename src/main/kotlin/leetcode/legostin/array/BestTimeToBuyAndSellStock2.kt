package leetcode.legostin.array

class BestTimeToBuyAndSellStock2 {

    fun maxProfit(prices: IntArray): Int {
        var profit = 0

        for (i in 1 until prices.size) {
            // нет комиссии, не нужно держать даже если мы все еще в восходящем тренде
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1]
            }
        }

        return profit
    }
}
