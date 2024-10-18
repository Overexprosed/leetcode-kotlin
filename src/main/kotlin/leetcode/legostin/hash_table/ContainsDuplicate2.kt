package leetcode.legostin.hash_table

import kotlin.math.abs

/**
 * Given an integer array nums and an integer k,
 * return true if there are two distinct indices i and j in the array such that nums(i) == nums(j) and abs(i - j) <= k.
 */
class ContainsDuplicate2 {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val numToIndexMap = mutableMapOf<Int, Int>()

        nums.indices.forEach { i ->
            val num = nums[i]

            if (numToIndexMap.containsKey(num) && abs(i - numToIndexMap[num]!!) <= k) {
                return true
            } else {
                numToIndexMap[num] = i
            }
        }

        return false
    }
}
