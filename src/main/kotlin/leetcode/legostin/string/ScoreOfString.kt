package leetcode.legostin.string

import kotlin.math.abs

class ScoreOfString {

    /**
     * Find a score of a String.
     *
     * Score - the sum of the absolute difference between the ASCII values of adjacent characters.
     *
     * Input: s = "zaz"
     * Output: 50
     * The ASCII values of the characters in s are: 'z' = 122, 'a' = 97.
     * So, the score of s would be |122 - 97| + |97 - 122| = 25 + 25 = 50.
     *
     * @return score of a string.
     */
    fun scoreOfString(s: String): Int {
        var score = 0

        for (i in 0 until s.length - 1) {
            score += abs(s[i] - s[i+1])
        }

        return score
    }
}
