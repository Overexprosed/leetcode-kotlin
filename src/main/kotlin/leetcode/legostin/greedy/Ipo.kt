package leetcode.legostin.greedy

import java.util.*

class Ipo {

    /**
     * Each time we find a project with max profit and within current capital capability.
     */
    fun findMaximizedCapital(k: Int, w: Int, profits: IntArray, capital: IntArray): Int {
        var currentCapital = w
        // Капитал от меньшего
        val pqCapital = PriorityQueue { a: IntArray, b: IntArray -> a[0] - b[0] }
        // Прибыль от большего
        val pqProfit = PriorityQueue { a: IntArray, b: IntArray -> b[1] - a[1] }

        // Инициализируем стартовые капиталы, сначала дешевые
        for (i in profits.indices) {
            pqCapital.add(intArrayOf(capital[i], profits[i]))
        }

        for (i in 0 until k) {
            // Добавляем в возможные прибыли все, что можем позволить с текущим капиталом
            while (pqCapital.isNotEmpty() && pqCapital.peek()[0] <= currentCapital) {
                pqProfit.add(pqCapital.poll())
            }

            // Берем самый выгодный
            if (pqProfit.isNotEmpty()) {
                currentCapital += pqProfit.poll()[1]
            }
        }

        return currentCapital
    }
}
