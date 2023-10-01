package leetcode.legostin.two_pointers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TwoSumTest {

    private val target = TwoSum()

    @Test
    fun test1() {
        val result = target.twoSum(numbers = intArrayOf(2, 7, 11, 15), target = 9)
        assertThat(result[0]).isEqualTo(1)
        assertThat(result[1]).isEqualTo(2)
    }

    @Test
    fun test2() {
        val result = target.twoSum(numbers = intArrayOf(2, 3, 4), target = 6)
        assertThat(result[0]).isEqualTo(1)
        assertThat(result[1]).isEqualTo(3)
    }

    @Test
    fun test3() {
        val result = target.twoSum(numbers = intArrayOf(-1, 0), target = -1)
        assertThat(result[0]).isEqualTo(1)
        assertThat(result[1]).isEqualTo(2)
    }
}
