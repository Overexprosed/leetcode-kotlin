package leetcode.legostin.graph

import java.util.PriorityQueue

class MaximumTotalImportanceOfRoads {

    fun maximumImportance(n: Int, roads: Array<IntArray>): Long {
        var importance = n
        val map = mutableMapOf<Int, Int>()

        roads.forEach { road ->
            map[road[0]] = map.getOrDefault(road[0], 0) + 1
            map[road[1]] = map.getOrDefault(road[1], 0) + 1
        }

        // По кол-ву граней от большего к меньшему
        val maxHeap = PriorityQueue { a: IntArray, b: IntArray -> b[1] - a[1] }
        map.forEach{ (k, v) ->
            maxHeap.add(intArrayOf(k, v))
        }

        while (maxHeap.isNotEmpty()) {
            val cityToCount = maxHeap.poll()
            map[cityToCount[0]] = importance--
        }

        var result = 0L
        roads.forEach { road ->
            result += map[road[0]]!! + map[road[1]]!!
        }

        return result
    }
}
