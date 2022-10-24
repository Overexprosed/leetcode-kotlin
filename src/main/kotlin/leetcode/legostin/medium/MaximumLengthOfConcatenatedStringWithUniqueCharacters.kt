package leetcode.legostin.medium

import kotlin.math.max

/**
 * You are given an array of strings arr.
 * A string s is formed by the concatenation of a subsequence of arr that has unique characters.
 *
 * Return the maximum possible length of s.
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements
 * without changing the order of the remaining elements.
 */
class MaximumLengthOfConcatenatedStringWithUniqueCharacters {

    private var max: Int = 0

    fun maxLength(arr: List<String>): Int {
        dfs(arr, 0, "")
        return max
    }

    private fun dfs(arr: List<String>, index: Int, str: String) {
        val unique = isUnique(str)
        if (unique) {
            max = max(max, str.length)
        }
        if (index == arr.size || !unique) return

        for (i in index until arr.size) {
            dfs(arr, i + 1, str + arr[i])
        }
    }

    private fun isUnique(str: String): Boolean {
        if (str.isEmpty()) return true

        val alpha = IntArray(26)
        for (element in str) {
            alpha[element - 'a']++
        }
        for (i in alpha.indices) {
            if (alpha[i] > 1) {
                return false
            }
        }
        return true
    }
}
