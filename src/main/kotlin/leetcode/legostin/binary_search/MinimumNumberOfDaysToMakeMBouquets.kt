package leetcode.legostin.binary_search

class MinimumNumberOfDaysToMakeMBouquets {

    fun minDays(bloomDay: IntArray, m: Int, k: Int): Int {
        var minimumDay = -1

        var start = 0
        var end = 0

        bloomDay.forEach { day ->
            end = end.coerceAtLeast(day)
        }

        while (start <= end) {
            val middle = (start + end) / 2

            if (calculateBouquets(bloomDay, middle, k) >= m) {
                minimumDay = middle
                end = middle - 1
            } else {
                start = middle + 1
            }
        }

        return minimumDay
    }

    private fun calculateBouquets(bloomDay: IntArray, middle: Int, k: Int): Int {
        var bouquets = 0
        var count = 0

        for (i in bloomDay.indices) {
            if (bloomDay[i] <= middle) {
                count++
            } else {
                count = 0
            }

            if (count == k) {
                bouquets++
                count = 0
            }
        }

        return bouquets
    }
}
