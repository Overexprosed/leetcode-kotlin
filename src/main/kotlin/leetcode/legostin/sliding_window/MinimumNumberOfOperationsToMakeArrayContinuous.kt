package leetcode.legostin.sliding_window

class MinimumNumberOfOperationsToMakeArrayContinuous {

    fun minOperations(nums: IntArray): Int {
        val length = nums.size
        // Убираем дубликаты, это работает потому что в решении используется длина оригинального массива
        val set = nums.toSet()
        val sorted = set.toIntArray().let { it.sort(); it }

        var result = length
        var right = 0
        for (left in sorted.indices) {

            // Разница между минимальным и максимальным элементом должны быть nums.length - 1
            // [1, 2, 3] -> 3 - 1 = 2. num.length (3) - 1 = 2
            // Но нам не подходит условие while nums[left] + nums.size - 1, мы хотим быть на один элемент впереди
            // Удобно в случае если в окне нет максимального значения для этой последовательности
            while (right < sorted.size && sorted[right] < sorted[left] + length) {
                right++
            }

            // не right - left - 1, т.к. мы впереди на 1 элемент
            val window = right - left
            val operationNumber = length - window
            result = Math.min(result, operationNumber)
        }
        return result
    }
}
