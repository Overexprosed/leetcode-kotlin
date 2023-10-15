package leetcode.legostin.backtracking

import java.util.Stack

class GenerateParentheses {

    fun generateParenthesis(n: Int): List<String> {
        val stack = Stack<String>()
        val result = mutableListOf<String>()

        backtrack(0, 0, n, result, stack)
        return result
    }

    private fun backtrack(open: Int, close: Int, n: Int, result: MutableList<String>, stack: Stack<String>) {
        if (open == close && close == n) {
            result.add(stack.joinToString(""))
            return
        }
        if (open < n) {
            stack.add("(")
            backtrack(open + 1, close, n, result, stack)
            stack.pop()
        }
        if (close < open) {
            stack.add(")")
            backtrack(open, close + 1, n, result, stack)
            stack.pop()
        }
    }
}
