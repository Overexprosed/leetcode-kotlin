package leetcode.legostin.binary_search

/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 */
class ValidPerfectSquare {

    fun isPerfectSquare(x: Int): Boolean {
        if (x < 0) return false

        var low = 0
        var high = x
        while (low <= high) {
            val mid = low + ((high - low) / 2)
            val sqr = mid * mid
            if (sqr == x) {
                return true
            }
            if (sqr > x) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }
        return false
    }
}
