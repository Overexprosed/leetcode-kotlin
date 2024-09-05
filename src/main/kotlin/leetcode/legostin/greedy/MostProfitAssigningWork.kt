package leetcode.legostin.greedy

import java.util.*

class MostProfitAssigningWork {

    fun maxProfitAssignment(difficulty: IntArray, profit: IntArray, worker: IntArray): Int {
        var resultProfit = 0
        worker.sortDescending()

        val profitToDifficulty = PriorityQueue { a: IntArray, b: IntArray -> b[0] - a[0] }
        for (i in difficulty.indices) {
            profitToDifficulty.add(intArrayOf(profit[i], difficulty[i]))
        }

        worker.forEach { workerCapacity ->
            while (profitToDifficulty.isNotEmpty() && profitToDifficulty.peek()[1] > workerCapacity) {
                profitToDifficulty.poll()
            }
            if (profitToDifficulty.isNotEmpty()) {
                resultProfit += profitToDifficulty.peek()[0]
            }
        }

        return resultProfit
    }
}
