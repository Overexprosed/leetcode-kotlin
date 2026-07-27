package leetcode.legostin.model

import java.util.Stack

@Suppress("unused")
class MinStack {

    private val stack = Stack<Int>()
    private val minStack = Stack<Int>()

    fun push(element: Int) {
        stack.push(element)

        val currentMin = if (minStack.isEmpty()) element else minStack.peek()
        minStack.push(Math.min(element, currentMin))
    }

    fun pop() {
        stack.pop()
        minStack.pop()
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return minStack.peek()
    }
}
