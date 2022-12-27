package leetcode.legostin.bit_manipulation

/**
 * The complement of an integer is the integer you get when you flip all the 0's to 1's
 * and all the 1's to 0's in its binary representation.
 *
 * For example, the integer 5 is "101" in binary and its complement is "010" which is the integer 2.
 * Given an integer num, return its complement.
 */
class NumberComplement {

    fun findComplement(num: Int): Int {
        // mask is all ones of num binary representation
        var mask = 1
        while (mask < num) {
            mask = (mask shl 1) or 1
        }
        return num xor mask
    }
}
