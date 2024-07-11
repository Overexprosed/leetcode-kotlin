@file:Suppress("DuplicatedCode")

package leetcode.legostin.stack

import java.util.Stack

class ReverseSubstringsBetweenEachPairOfParentheses {

    fun reverseParentheses(s: String): String {
        val openParenthesesIndices = Stack<Int>()
        val builder = StringBuilder()

        val charArray = s.toCharArray()
        for (i in charArray.indices) {

            when (val char = charArray[i]) {
                '(' -> openParenthesesIndices.add(builder.length)

                ')' -> {
                    val start = openParenthesesIndices.pop()
                    reverse(builder, start, builder.length - 1)
                }

                else -> builder.append(char)
            }
        }

        return builder.toString()
    }

    private fun reverse(builder: StringBuilder, startIndex: Int, endIndex: Int) {
        var start = startIndex
        var end = endIndex

        while (start < end) {
            val tmp = builder[start]
            builder[start] = builder[end]
            builder[end] = tmp

            start++
            end--
        }
    }
}
