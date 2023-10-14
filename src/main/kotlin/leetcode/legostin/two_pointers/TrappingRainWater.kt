package leetcode.legostin.two_pointers

class TrappingRainWater {

    fun trap(height: IntArray): Int {
        if (height.isEmpty()) return 0

        var left = 0
        var maxLeft = height[left]

        var right = height.size - 1
        var maxRight = height[right]

        var result = 0

        while (left < right) {
            // if отвечает за то в какую сторону будет стекать вода
            if (maxLeft < maxRight) {
                left++
                // после if мы можем просто считать что единственной преградой остается высота соседа, не выльется ли вода
                maxLeft = Math.max(maxLeft, height[left])
                result += maxLeft - height[left]
            } else {
                right--
                maxRight = Math.max(maxRight, height[right])
                result += maxRight - height[right]
            }
        }
        return result
    }
}
