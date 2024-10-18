package leetcode.legostin.array

/**
 * You are given a sorted unique integer array nums.
 * A range [a,b] is the set of all integers from a to b (inclusive).
 *
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
 *
 * Input: nums = [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 */
class SummaryRanges {

    fun summaryRanges(nums: IntArray): List<String> {
        val intervals = mutableListOf<MutableList<Int>>()

        var pointer = 0
        while (pointer < nums.size) {
            // Create a new interval with opening number
            val interval = mutableListOf(nums[pointer])

            val safeCheck = { pointer != nums.size - 1 }
            val hasNext = { (nums[pointer] + 1) == nums[pointer + 1] }

            // Fill the interval while the condition is met
            while (safeCheck.invoke() && hasNext.invoke()) {
                pointer++
                interval.add(nums[pointer])
            }

            // Shift pointer for the next interval
            pointer++

            intervals.add(interval)
        }

        return intervals.map { interval ->
            val start = interval.first()
            val end = if (interval.size > 1) interval.lastOrNull() else null

            end?.let { "$start->$it" } ?: start.toString()
        }
    }
}
