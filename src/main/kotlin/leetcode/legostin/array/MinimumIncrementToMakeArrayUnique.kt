package leetcode.legostin.array

import kotlin.math.abs

class MinimumIncrementToMakeArrayUnique {

    fun minIncrementForUnique(nums: IntArray): Int {
        if (nums.size == 1) return 0

        var moves = 0
        nums.sort()

        var pointer1 = 0
        var pointer2 = 1

        while (pointer2 < nums.size) {
            if (nums[pointer2] <= nums[pointer1]) {
                val localMoves = abs(nums[pointer1] - nums[pointer2]) + 1
                nums[pointer2] += localMoves

                moves += localMoves
            }
            pointer1++
            pointer2++
        }

        return moves
    }
}
