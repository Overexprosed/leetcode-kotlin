package leetcode.legostin.hash_table

import java.util.*
import kotlin.math.atan2


class MaxPointsOnLine {

    fun maxPoints(points: Array<IntArray>): Int {
        val length = points.size
        if (length == 1) {
            return 1
        }
        var result = 2
        for (i in 0 until length) {
            val atan2ToCount = HashMap<Double, Int>()
            for (j in 0 until length) {
                if (j != i) {
                    atan2ToCount.merge(
                        atan2(
                            (points[j][1] - points[i][1]).toDouble(),
                            (points[j][0] - points[i][0]).toDouble()
                        ), 1
                    ) { a: Int?, b: Int? -> Integer.sum(a!!, b!!) }
                }
            }
            result = Math.max(result, Collections.max(atan2ToCount.values) + 1)
        }
        return result
    }
}
