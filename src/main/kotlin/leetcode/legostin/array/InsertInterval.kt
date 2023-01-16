package leetcode.legostin.array

class InsertInterval {

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val result = ArrayList<IntArray>()

        val arrayWithNewInterval = insertInterval(intervals, newInterval)

        var count = 0
        while (count < arrayWithNewInterval.size) {
            var curr = intArrayOf(arrayWithNewInterval[count][0], arrayWithNewInterval[count][1])
            while (count < arrayWithNewInterval.size && doesIntervalsOverlap(curr, arrayWithNewInterval[count])) {
               curr = mergeIntervals(curr, arrayWithNewInterval[count])
               count++
            }
            result.add(curr)
        }
        return result.toTypedArray()
    }

    private fun doesIntervalsOverlap(a: IntArray, b: IntArray): Boolean =
        Math.min(a[1], b[1]) - Math.max(a[0], b[0]) >= 0

    private fun mergeIntervals(a: IntArray, b: IntArray): IntArray {
        val newInterval = IntArray(2)
        newInterval[0] = Math.min(a[0], b[0])
        newInterval[1] = Math.max(a[1], b[1])
        return newInterval
    }

    private fun insertInterval(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val newIntervals = intervals.toMutableList()
        var inserted = false
        for (i in intervals.indices) {
            if (newInterval[0] < intervals[i][0]) {
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
