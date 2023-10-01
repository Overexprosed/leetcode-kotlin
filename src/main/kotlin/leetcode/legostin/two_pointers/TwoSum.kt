package leetcode.legostin.two_pointers

/**
 * Two pointers.
 */
class TwoSum {

    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var pointer1 = 0
        var pointer2 = numbers.size - 1

        while (pointer1 < pointer2) {
            val sum = numbers[pointer1] + numbers[pointer2]

            if (sum == target) {
                return intArrayOf(pointer1 + 1, pointer2 + 1)
            }
            if (sum > target) {
                pointer2--
                continue
            }
            pointer1++
        }
        throw IllegalArgumentException("No solution")
    }
}
