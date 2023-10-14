package leetcode.legostin.stack

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvaluateReversePolishNotationTest {

    private val target = EvaluateReversePolishNotation()

    @Test
    fun test1() {
        val result = target.evalRPN(tokens = arrayOf("2", "1", "+", "3", "*"))
        assertThat(result).isEqualTo(9)
    }

    @Test
    fun test2() {
        val result = target.evalRPN(tokens = arrayOf("4", "13", "5", "/", "+"))
        assertThat(result).isEqualTo(6)
    }

    @Test
    fun test3() {
        val result =
            target.evalRPN(tokens = arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"))
        assertThat(result).isEqualTo(22)
    }
}
