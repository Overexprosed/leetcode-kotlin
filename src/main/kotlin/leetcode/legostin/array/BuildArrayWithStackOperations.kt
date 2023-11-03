package leetcode.legostin.array

import java.util.Stack

class BuildArrayWithStackOperations {

    fun buildArray(target: IntArray, n: Int): List<String> {
        val result = mutableListOf<String>()
        val stack = Stack<Int>()

        var i = 1
        var arrayIndex = 0
        while (i <= n && arrayIndex < target.size) {
            val nextTarget = target[arrayIndex]
            val next = i

            if (next < nextTarget) {
                result.add("Push")
                result.add("Pop")
                i++
                continue
            }

            stack.add(next)
            result.add("Push")
            arrayIndex++
            i++
        }
        return result
    }
}
