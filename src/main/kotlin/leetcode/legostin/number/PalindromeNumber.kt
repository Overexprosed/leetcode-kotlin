package leetcode.legostin.number

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 * Constraints : -2^31 <= x <= 2^31 - 1
 *
 * Integer.MAX_VALUE = 2147483647
 * Integer.MIN_VALUE = -2147483648
 */
class PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        if (x == 0) return true
        if (x < 0) return false

        var number = x
        var reversed = 0
        while (number != 0) {
            val digit = number % 10
            reversed = reversed * 10 + digit
            number /= 10
        }
        return reversed == x
    }
}
