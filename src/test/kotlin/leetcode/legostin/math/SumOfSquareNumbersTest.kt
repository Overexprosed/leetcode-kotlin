package leetcode.legostin.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SumOfSquareNumbersTest {

    private val target = SumOfSquareNumbers()

    @Test
    fun test1() {
        target.judgeSquareSum(c = 5).let { assertThat(it).isTrue }
    }

    @Test
    fun test2() {
        target.judgeSquareSum(c = 3).let { assertThat(it).isFalse }
    }

    @Test
    fun test3() {
        target.judgeSquareSum(c = 6).let { assertThat(it).isFalse }
    }

    @Test
    fun test4() {
        target.judgeSquareSum(c = 2).let { assertThat(it).isTrue }
    }

    @Test
    fun test5() {
        target.judgeSquareSum(c = 2147483600).let { assertThat(it).isTrue }
    }
}
