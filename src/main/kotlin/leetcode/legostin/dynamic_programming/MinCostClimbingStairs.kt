package leetcode.legostin.dynamic_programming

class MinCostClimbingStairs {

    fun minCostClimbingStairs(cost: IntArray): Int {
        val costs = cost + 0

        for (i in cost.size - 3 downTo 0) {
            costs[i] = Math.min((costs[i] + costs[i + 1]), (costs[i] + costs[i + 2]))
        }
        return Math.min(costs[0], costs[1])
    }
}
