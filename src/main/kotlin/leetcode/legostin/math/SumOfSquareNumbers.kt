package leetcode.legostin.math

import kotlin.math.sqrt

class SumOfSquareNumbers {

    fun judgeSquareSum(c: Int): Boolean {
        var left = 0
        var right = sqrt(c.toDouble()).toLong()

        while (left <= right) {
            val sum = left * left + right * right

            when {
                sum > c -> right--
                sum < c -> left++
                else -> return true
            }
        }

        return false
    }
}
