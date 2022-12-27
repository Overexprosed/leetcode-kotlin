package leetcode.legostin.string

import java.util.Stack

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']'.
 * Determine if the input string is valid.
 *
 * An input string is valid if:
 *  - Open brackets must be closed by the same type of brackets.
 *  - Open brackets must be closed in the correct order.
 *
 * Example 1:
 *  Input: s = "()"
 *  Output: true
 *
 * Example 2:
 *  Input: s = "()[]{}"
 *  Output: true
 *
 * Example 3:
 *  Input: s = "(]"
 *  Output: false
 *
 * ---
 * If character is open parentheses - add to stack.
 * If character is close parentheses - check for previous stack element.
 * Else add to stack.
 * Last step is check stack for empty.
 */
class ValidParentheses {

    fun isValid(s: String): Boolean {
        if (s.isEmpty()) return false

        val map = HashMap<Char, Char>()
        map[')'] = '('
        map[']'] = '['
        map['}'] = '{'

        val stack = Stack<Char>()
        val charArray = s.toCharArray()
        for (c in charArray) {
            if (stack.isNotEmpty() && stack.peek() == map[c]) {
                stack.pop()
            } else {
                stack.push(c)
            }
        }
        return stack.isEmpty()
    }
}
