package leetcode.legostin.stack

import java.util.Stack
import kotlin.math.max
import kotlin.math.min

class MaximumScoreFromRemovingSubstrings {

    fun maximumGain(s: String, x: Int, y: Int): Int {
        var totalScore = 0

        val highPriorityPair = if (x > y) "ab" else "ba"
        val lowPriorityPair = if (x > y) "ba" else "ab"

        val newStr1 = remove(s, highPriorityPair)
        totalScore += ((s.length - newStr1.length) / 2) * max(x, y)

        val newStr2 = remove(newStr1, lowPriorityPair)
        totalScore += ((newStr1.length - newStr2.length) / 2) * min(x, y)

        return totalScore
    }

    private fun remove(str: String, pair: String): String {
        val stack = Stack<Char>()
        val builder = StringBuilder()

        str.toCharArray().forEach { char ->
            if (char == pair[1] && stack.isNotEmpty() && stack.peek() == pair[0]) {
                stack.pop()
            } else {
                stack.add(char)
            }
        }

        while (stack.isNotEmpty()) {
            builder.append(stack.pop())
        }

        return builder.reverse().toString()
    }
}
