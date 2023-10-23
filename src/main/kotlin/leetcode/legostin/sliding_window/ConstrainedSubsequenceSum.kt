package leetcode.legostin.sliding_window

import java.util.LinkedList

class ConstrainedSubsequenceSum {

    fun constrainedSubsetSum(nums: IntArray, k: Int): Int {
        if (nums.isEmpty()) return 0

        var result = nums[0]
        val linkedList = LinkedList<Int>() // хранит индексы

        // Локальный максимум до i, с учетом окна
        val sum = IntArray(nums.size)

        for (i in nums.indices) {
            sum[i] = nums[i]
            if (linkedList.isNotEmpty()) {
                sum[i] += sum[linkedList.peek()]
            }
            result = Math.max(result, sum[i])

            // Размер окна: i - k + 1
            while (linkedList.isNotEmpty() && linkedList.peek() < i - k + 1) {
                linkedList.poll() // выпуливаем начало, чтобы оставаться в окне, при чем размер листа не является текущим размером окна
            }

            // Убираем из списка все элементы, которые меньше текущего
            while (linkedList.isNotEmpty() && sum[linkedList.peekLast()] <= sum[i]) {
                linkedList.pollLast() // выпуливаем конец, и класть будем в конец, так что макс значение будет в начале
            }

            if (sum[i] >= 0) {
                linkedList.offer(i)
            }
        }
        return result
    }
}
