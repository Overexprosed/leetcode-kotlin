package leetcode.legostin.greedy

/**
 * Начинаем с конца и обновляем цель, двигая ее в начало.
 * В некоторые позиции (из которых перейти на шаг к цели нельзя) нам неинтересно перемещаться.
 */
class JumpGame {

    fun canJump(nums: IntArray): Boolean {
        var goal = nums.size - 1

        for (i in nums.size - 1 downTo 0) {
            // Хватит ли скачка с индекса i до цели
            if ((i + nums[i]) >= goal) {
                goal = i
            }
        }
        return goal == 0
    }
}
