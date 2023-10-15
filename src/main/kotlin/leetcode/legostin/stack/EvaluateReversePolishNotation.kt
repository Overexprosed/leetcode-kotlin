package leetcode.legostin.stack

import java.util.Stack

class EvaluateReversePolishNotation {

    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()

        tokens.forEach { token ->
            when (token) {
                "+" -> stack.add(stack.pop() + stack.pop())
                "-" -> {
                    val a = stack.pop()
                    val b = stack.pop()
                    stack.add(b - a)
                }
                "*" -> stack.add(stack.pop() * stack.pop())
                "/" -> {
                    val a = stack.pop()
                    val b = stack.pop()
                    stack.add(b / a)
                }
                else -> stack.add(token.toInt())
            }
        }
        return stack[0]
    }
}
