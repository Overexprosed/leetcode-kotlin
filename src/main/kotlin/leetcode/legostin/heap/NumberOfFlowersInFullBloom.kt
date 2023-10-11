package leetcode.legostin.heap

import java.util.PriorityQueue

class NumberOfFlowersInFullBloom {

    fun fullBloomFlowers(flowers: Array<IntArray>, people: IntArray): IntArray {
        val result = IntArray(people.size) { 0 }

        val peopleToIndex = people.indices.map { i -> Pair(people[i], i) }

        val start = PriorityQueue<Int>(flowers.size)
        flowers.forEach { start.add(it[0]) }

        val end = PriorityQueue<Int>(flowers.size)
        flowers.forEach { end.add(it[1]) }

        var count = 0

        peopleToIndex.sortedBy { it.first }.forEach { (people, index) ->
            while (start.isNotEmpty() && start.peek() <= people) {
                start.poll()
                count++
            }
            while (end.isNotEmpty() && end.peek() < people) {
                end.poll()
                count--
            }
            result[index] = count
        }

        return result
    }
}
