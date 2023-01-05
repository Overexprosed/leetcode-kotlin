package leetcode.legostin.array

import java.util.*

class MinimumNumberArrowsBurstBalloons {

    fun findMinArrowShots(points: Array<IntArray>): Int {
        if (points.isEmpty()) return 0

        Arrays.sort(points) { a: IntArray, b: IntArray -> a[1].compareTo(b[1]) }

        var arrows = 1
        var previousTop = points[0][1]
        for (i in 0 until points.size - 1) {
            val next = points[i + 1]
            if (previousTop < next[0]) { // not overlap
                previousTop = next[1]
                arrows++
            }
        }
        return arrows
    }
}
