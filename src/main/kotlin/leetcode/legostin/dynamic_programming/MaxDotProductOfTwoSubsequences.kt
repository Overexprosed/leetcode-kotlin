package leetcode.legostin.dynamic_programming

import java.util.*

class MaxDotProductOfTwoSubsequences {

    private var dotProductMatrix = Array(505) { IntArray(505) } // Dynamic programming array

    private var nums1Size = 0
    private var nums2Size:Int = 0


    fun maxDotProduct(nums1: IntArray, nums2: IntArray): Int {
        nums1Size = nums1.size
        nums2Size = nums2.size

        var firstMax = Int.MIN_VALUE
        var secondMax = Int.MIN_VALUE
        var firstMin = Int.MAX_VALUE
        var secondMin = Int.MAX_VALUE

        // Calculate maximum and minimum values for nums1

        // Calculate maximum and minimum values for nums1
        for (num in nums1) {
            firstMax = Math.max(firstMax, num)
            firstMin = Math.min(firstMin, num)
        }

        // Calculate maximum and minimum values for nums2

        // Calculate maximum and minimum values for nums2
        for (num in nums2) {
            secondMax = Math.max(secondMax, num)
            secondMin = Math.min(secondMin, num)
        }

        // Check special cases where all elements are negative

        // Check special cases where all elements are negative
        if (firstMax < 0 && secondMin > 0 || firstMin > 0 && secondMax < 0) {
            return Math.max(firstMax * secondMin, firstMin * secondMax)
        }

        // Initialize the dot product matrix with 0

        // Initialize the dot product matrix with 0
        for (i in 0..504) {
            Arrays.fill(dotProductMatrix[i], 0)
        }

        // Calculate dot products and populate the dot product matrix

        // Calculate dot products and populate the dot product matrix
        for (i in nums1Size - 1 downTo 0) {
            for (j in nums2Size - 1 downTo 0) {
                val currentDotProduct = nums1[i] * nums2[j] + dotProductMatrix[i + 1][j + 1]

                dotProductMatrix[i][j] = Math.max(
                    Math.max(currentDotProduct, dotProductMatrix[i + 1][j]),
                    dotProductMatrix[i][j + 1]
                )
            }
        }
        return dotProductMatrix[0][0] // Return the maximum dot product
    }
}
