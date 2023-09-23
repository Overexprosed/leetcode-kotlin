package leetcode.legostin.array

class LongestConsecutiveSequence {

    fun longestConsecutive(nums: IntArray): Int {
        if (nums.size <= 1) return nums.size

        var longest = 0
        val set = nums.toHashSet()

        nums.forEach { number ->
            // если не начало последовательности - не интересует
            if (!set.contains(number - 1)) {
                var length = 0
                while (set.contains(number + length)) {
                    length++
                    longest = longest.coerceAtLeast(length)
                }
            }
        }
        return longest
    }
}
