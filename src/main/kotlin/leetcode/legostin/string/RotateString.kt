package leetcode.legostin.string

/**
 * Given two strings s and goal.
 * Return true if and only if s can become goal after some number of shifts on s.
 *
 * A shift on s consists of moving the leftmost character of s to the *rightmost* position.
 *
 * Input: s = "abcde", goal = "cdeab"
 * Output: true
 */
class RotateString {

    fun rotateString(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false
        return "$s$s".contains(goal)
    }
}
