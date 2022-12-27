package leetcode.legostin.bit_manipulation

/**
 * Given a non-empty array of integers nums, every element appears TWICE except for one.
 * Find that single one.
 *
 * XOR
 * 1^1=0
 * 0^0=0
 * 1^0=1
 * 0^1=1
 *
 * Why it's work:
 * ---
 * N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
 * = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
 * 0 ^ 0 ^ ..........^ 0 ^ N
 * = N
 * ---
 *
 * Work only when duplicates appear 2,4,6... times
 */
class SingleNumber {

    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (i in nums.indices) {
            val number = nums[i]
            result = result xor number
        }
        return result
    }
}
