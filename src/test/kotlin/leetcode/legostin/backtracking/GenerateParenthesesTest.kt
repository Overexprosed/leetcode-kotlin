package leetcode.legostin.backtracking

import org.junit.jupiter.api.Test

class GenerateParenthesesTest {

    private val target = GenerateParentheses()

    @Test
    fun test1() {
        target.generateParenthesis(3).also { println(it) }
    }
}
