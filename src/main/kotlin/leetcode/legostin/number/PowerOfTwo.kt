package leetcode.legostin.number

/**
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 */
class PowerOfTwo {

    fun isPowerOfTwo(n: Int): Boolean {
        var check = 1
        while (check < n) {
            check *= 2
        }
        return check == n
    }
}
