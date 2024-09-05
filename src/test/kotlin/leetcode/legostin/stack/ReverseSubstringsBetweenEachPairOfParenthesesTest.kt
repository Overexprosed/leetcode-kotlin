package leetcode.legostin.stack

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReverseSubstringsBetweenEachPairOfParenthesesTest {

    private val target = ReverseSubstringsBetweenEachPairOfParentheses()

    @Test
    fun test1() {
        target.reverseParentheses(s = "(abcd)").let {
            assertThat(it).isEqualTo("dcba")
        }
    }

    @Test
    fun test2() {
        target.reverseParentheses(s = "(u(love)i)").let {
            assertThat(it).isEqualTo("iloveu")
        }
    }

    @Test
    fun test3() {
        target.reverseParentheses(s = "(ed(et(oc))el)").let {
            assertThat(it).isEqualTo("leetcode")
        }
    }
}
