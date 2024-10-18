package leetcode.legostin.array

import kotlin.math.max
import kotlin.math.min

/**
 * Given an array of intervals, merge all overlapping intervals
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 */
class MergeIntervals {

    fun merge(inIntervals: Array<IntArray>): Array<IntArray> {
        val intervals = inIntervals.sortedBy { it[0] }
        val result = mutableListOf<IntArray>()

        var pointer = 0
        while (pointer < intervals.size) {
            val currentInterval = intervals[pointer]

            // Conditions
            val safeCheck = { pointer != intervals.size - 1 }
            // Check the current interval to see if there is an interval that overlaps all others.
            // It`s work because overlap conditions check only right index (can afford it, thanks to sorting)
            val overlap = { currentInterval[1] >= intervals[pointer + 1][0] }

            while (safeCheck.invoke() && overlap.invoke()) {
                pointer++
                currentInterval[0] = min(currentInterval[0], intervals[pointer][0])
                currentInterval[1] = max(currentInterval[1], intervals[pointer][1])
            }

            result.add(currentInterval)

            // Prepare pointer for the next interval
            pointer++
        }

        return result.toTypedArray()
    }
}
