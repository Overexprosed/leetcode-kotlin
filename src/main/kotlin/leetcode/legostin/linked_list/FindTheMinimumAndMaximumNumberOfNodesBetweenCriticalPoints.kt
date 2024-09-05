package leetcode.legostin.linked_list

import leetcode.legostin.model.ListNode

class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {

    fun nodesBetweenCriticalPoints(head: ListNode?): IntArray {
        if (head?.next?.next == null) { // Работаем как минимум с 3 узлами
            return intArrayOf(-1, -1)
        }

        val criticalPoints = mutableListOf<Int>()
        var modify: ListNode? = head

        var index = 2
        while (modify?.next?.next != null) {
            val value1 = modify.value
            val value2 = modify.next!!.value
            val value3 = modify.next!!.next!!.value

            val greater = value2 > value1 && value2 > value3
            val less = value2 < value1 && value2 < value3

            if (greater || less) {
                criticalPoints.add(index)
            }

            modify = modify.next
            index++
        }

        if (criticalPoints.size <= 1) {
            return intArrayOf(-1, -1)
        }

        if (criticalPoints.size == 2) {
            val distance = criticalPoints[1] - criticalPoints[0]
            return intArrayOf(distance, distance)
        }

        val maxDistance = criticalPoints.last() - criticalPoints.first()
        var minDistance = criticalPoints[1] - criticalPoints[0]

        // check min distance
        for (i in 1 until criticalPoints.size) {
            minDistance = minDistance.coerceAtMost(criticalPoints[i] - criticalPoints[i - 1])
        }

        return intArrayOf(minDistance, maxDistance)
    }
}
