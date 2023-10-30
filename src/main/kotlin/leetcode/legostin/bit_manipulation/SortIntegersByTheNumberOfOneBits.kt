package leetcode.legostin.bit_manipulation

import java.lang.Integer.bitCount

/**
Since the input values can range from 0 to 10000,
we can add to each element on the array the value of the bit count (number of 1s) multiplied by 10001.

10001 is not a magic number, it is merely the max possible number the array may have + 1,
which ensures that the bit count has the maximum priority,
and that we do not mistakenly erase a number when reverting the array back to its original values (after sorting).

This approach is an effective way of sorting by more than one-criteria,
a similar logic could be applied to more complex problems.
 */
class SortIntegersByTheNumberOfOneBits {

    fun sortByBits(arr: IntArray): IntArray {
        for (i in arr.indices) {
            arr[i] += bitCount(arr[i]) * 10001
        }
        arr.sort()
        for (i in arr.indices) {
            arr[i] %= 10001
        }
        return arr
    }
}
