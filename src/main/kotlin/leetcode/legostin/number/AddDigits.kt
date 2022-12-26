package leetcode.legostin.number

/**
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 *
 * 38 -> 3 + 8 = 11 -> 1 + 1 = 2
 * 9 -> 9
 */
class AddDigits {

    fun addDigits(num: Int): Int {
        var number = num
        if (num < 0) {
            throw IllegalArgumentException()
        }
        if (num < 10) {
            return num
        }

        while (number >= 10) {
            var totalSum = 0
            while (number > 0) {
                totalSum += number % 10
                number /= 10
            }
            number = totalSum
        }
        return number
    }
}
