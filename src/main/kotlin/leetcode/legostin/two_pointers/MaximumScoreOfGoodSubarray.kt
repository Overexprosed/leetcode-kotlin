package leetcode.legostin.two_pointers

/**
 * В subarray должен входить элемент с индексом k.
 * Потом нужно взять минимальный элемент в subarray и умножить его на длину subarray, получим score.
 *
 * 2 указателя, начинаем с элемента k.
 * Будем жадными и двигаем указатель на соседа по-больше.
 */
class MaximumScoreOfGoodSubarray {

    fun maximumScore(nums: IntArray, k: Int): Int {
        if (nums.isEmpty()) return 0

        var left = k
        var right = k

        var maxScore = nums[k]
        var minElement = nums[k]


        while (left > 0 || right < nums.size - 1) {
            // Будем жадными и двигаем указатель в сторону соседа по-больше

            // Можем по-умолчанию присвоить 0, т.к. все элементы в массиве положительные
            val leftValue = if (left > 0) nums[left - 1] else 0
            val rightValue = if (right < nums.size - 1) nums[right + 1] else 0

            minElement = if (leftValue > rightValue) {
                left--
                Math.min(minElement, leftValue)
            } else {
                right++
                Math.min(minElement, rightValue)
            }
            val newScore = minElement * (right - left + 1)
            maxScore = Math.max(maxScore, newScore)
        }
        return maxScore
    }
}
