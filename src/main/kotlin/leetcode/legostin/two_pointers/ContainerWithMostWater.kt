package leetcode.legostin.two_pointers

class ContainerWithMostWater {

    fun maxArea(height: IntArray): Int {
        var result = 0
        var left = 0
        var right = height.size - 1

        while (left < right) {
            val area = (right - left) * height[left].coerceAtMost(height[right])
            result = result.coerceAtLeast(area)

            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        return result
    }
}
