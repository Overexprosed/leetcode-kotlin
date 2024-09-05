package leetcode.legostin.greedy

class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {

    fun minDifference(nums: IntArray): Int {
        if (nums.size <= 4) return 0

        nums.sort()

        var right = nums.size - 4

        var minDiff = Integer.MAX_VALUE
        for (left in 0 until 4) {
            minDiff = minDiff.coerceAtMost(nums[right] - nums[left])

            right++
        }

        return minDiff
    }
}
