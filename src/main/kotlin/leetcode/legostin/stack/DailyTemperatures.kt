package leetcode.legostin.stack

import java.util.Stack

class DailyTemperatures {

    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val result = IntArray(temperatures.size) { 0 }
        val stack = Stack<Pair<Int, Int>>()

        temperatures.indices.forEach { i ->
            while (stack.isNotEmpty() && stack.peek().first < temperatures[i]) {
                val pop = stack.pop()
                val daysToWait = i - pop.second
                result[pop.second] = daysToWait
            }
            stack.add(Pair(temperatures[i], i))
        }

        return result
    }
}
