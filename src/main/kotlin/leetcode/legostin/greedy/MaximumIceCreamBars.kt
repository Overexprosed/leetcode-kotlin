package leetcode.legostin.greedy

class MaximumIceCreamBars {

    fun maxIceCream(costs: IntArray, coins: Int): Int {
        if (costs.isEmpty() || coins == 0) return 0

        costs.sort()
        var coinsLeft = coins
        var bars = 0
        for (cost in costs) {
            if (cost <= coinsLeft) {
                bars++
                coinsLeft -= cost
            } else {
                break
            }
        }
        return bars
    }
}
