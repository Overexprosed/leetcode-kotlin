package leetcode.legostin.array

import java.util.*

class MostBeautifulItemForEachQuery {

    fun maximumBeauty(items: Array<IntArray>, queries: IntArray): IntArray {
        val result = IntArray(queries.size)
        items.sortBy { it[0] } // asc

        // asc by price
        val map = TreeMap<Int, Int>().apply { put(0, 0) }

        var currMax = 0
        for (item in items) {
            currMax = maxOf(currMax, item[1])
            map[item[0]] = currMax
        }

        for (i in queries.indices) {
            // max beauty
            result[i] = map.floorEntry(queries[i])?.value ?: 0
        }

        return result
    }
}
