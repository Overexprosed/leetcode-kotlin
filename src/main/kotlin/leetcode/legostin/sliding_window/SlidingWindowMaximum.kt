package leetcode.legostin.sliding_window

import java.util.LinkedList

class SlidingWindowMaximum {

    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        if (nums.isEmpty()) return nums

        val result = IntArray(nums.size - k + 1)
        val linkedList = LinkedList<Int>() // хранит индексы

        for (i in nums.indices) {
            // Размер окна: i - k + 1
            while (linkedList.isNotEmpty() && linkedList.peek() < i - k + 1) {
                linkedList.poll() // выпуливаем начало, чтобы оставаться в окне, при чем размер листа не является текущим размером окна
            }

            // Убираем из списка все элементы, которые меньше текущего
            while (linkedList.isNotEmpty() && nums[linkedList.peekLast()] <= nums[i]) {
                linkedList.pollLast() // выпуливаем конец, и класть будем в конец, так что макс значение будет в начале
            }

            linkedList.offer(i)
            if (i - k + 1 >= 0) {
                result[i - k + 1] = nums[linkedList.peek()] // в начале хранится максимум
            }
        }
        return result
    }
}
