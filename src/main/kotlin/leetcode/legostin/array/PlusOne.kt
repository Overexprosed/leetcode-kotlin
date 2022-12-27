package leetcode.legostin.array

/**
 * Plus One
 *
 * Given a non-empty array of decimal digits representing a non-negative integer.
 * Increment one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contains a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */
class PlusOne {

    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] != 9) {
                digits[i] = ++digits[i]
                return digits
            } else {
                digits[i] = 0
            }
        }
        // initial array consists only 9s
        if (digits[0] == 0) {
            val newArray = IntArray(digits.size + 1)
            newArray[0] = 1
            return newArray
        }
        return digits
    }
}
