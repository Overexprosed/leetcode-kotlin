package leetcode.legostin.math

class PowerOfFour {

    fun isPowerOfFour(n: Int): Boolean {
        var number = n

        while (number >= 4) {
            val reminder = number % 4
            if (reminder > 0) {
                return false
            }
            number /= 4
        }
        return number == 1
    }
}
