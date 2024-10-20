package leetcode.legostin.array

import kotlin.math.max
import kotlin.math.min

class InsertInterval {

    fun insert(inIntervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val result = ArrayList<IntArray>()
        val intervals = inIntervals.insertInterval(newInterval)

        var pointer = 0
        while (pointer < intervals.size) {
            var currentInterval = intervals[pointer]

            while (pointer < intervals.size && currentInterval.overlap(intervals[pointer])) {
               currentInterval = currentInterval.merge(intervals[pointer])
               pointer++
            }

            result.add(currentInterval)
        }

        return result.toTypedArray()
    }

    private fun IntArray.overlap(other: IntArray): Boolean {
        return min(this[1], other[1]) - max(this[0], other[0]) >= 0
    }

    private fun IntArray.merge(other: IntArray): IntArray =
        IntArray(2).also {
            it[0] = min(this[0], other[0])
            it[1] = max(this[1], other[1])
        }

    private fun Array<IntArray>.insertInterval(newInterval: IntArray): Array<IntArray> {
        val newIntervals = this.toMutableList()
        var inserted = false

        for (i in this.indices) {
            if (newInterval[0] < this[i][0]) {
                newIntervals.add(i, newInterval)
                inserted = true
                break
            }
        }

        if (!inserted) {
            newIntervals.add(newInterval)
        }

        return newIntervals.toTypedArray()
    }
}
