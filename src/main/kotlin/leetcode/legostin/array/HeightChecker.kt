package leetcode.legostin.array

class HeightChecker {

    fun heightChecker(heights: IntArray): Int {
        val sorted = heights.sorted()
        var diff = 0

        for (i in heights.indices) {
            if (heights[i] != sorted[i]) {
                diff++
            }
        }

        return diff
    }
}
