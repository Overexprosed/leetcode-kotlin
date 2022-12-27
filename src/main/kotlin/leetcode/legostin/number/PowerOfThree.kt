package leetcode.legostin.number

/**
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * An integer n is a power of three, if there exists an integer x such that n == 3^x.
 */
class PowerOfThree {

    fun isPowerOfThree(n: Int): Boolean {
        var x = n
        while (x >= 3) {
            val reminder = x % 3
            if (reminder > 0) {
                return false
            }
            x /= 3
        }
        return x == 1
    }
}
