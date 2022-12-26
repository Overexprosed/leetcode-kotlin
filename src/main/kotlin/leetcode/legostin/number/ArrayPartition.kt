package leetcode.legostin.number

class ArrayPartition {

    fun arrayPairSum(nums: IntArray): Int {
        val numbers = nums.copyOf()
        numbers.sort()

        var result = 0
        for (i in numbers.indices step 2) {
            result += numbers[i].coerceAtMost(numbers[i + 1])
        }
        return result
    }
}