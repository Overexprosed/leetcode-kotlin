package leetcode.legostin.hash_table

import java.util.*

/**
 * The next greater element of some element x in an array is the first greater element
 * that is to the right of x in the same array.
 *
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
 *
 * For each 0 <= i < nums1.length,
 * find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2.
 * If there is no next greater element, then the answer for this query is -1.
 *
 * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 */
class NextGreaterElement {

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val map = HashMap<Int, Int>()
        // responsible for 'greater'
        val stack = LinkedList<Int>()

        for (i in nums2.indices) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map[stack.pop()] = nums2[i]
            }
            stack.push(nums2[i])
        }
        val result = IntArray(nums1.size)
        for (i in nums1.indices) {
            result[i] = map.getOrDefault(nums1[i], -1)
        }
        return result
    }
}
