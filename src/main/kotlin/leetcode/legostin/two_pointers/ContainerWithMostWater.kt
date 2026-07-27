package leetcode.legostin.two_pointers

class ContainerWithMostWater {

    fun maxArea(height: IntArray): Int {
        var result = 0
        var left = 0
        var right = height.size - 1

        while (left < right) {
            val area = (right - left) * Math.min(height[left], height[right])
            result = Math.max(result, area)

            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        return result
    }
}
