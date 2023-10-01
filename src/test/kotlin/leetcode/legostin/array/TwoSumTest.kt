package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TwoSumTest {

    private val target = TwoSum()

    @Test
    fun test1() {
        val result = target.twoSum(nums = intArrayOf(2, 7, 11, 15), target = 9)
        assertThat(result[0]).isEqualTo(0)
        assertThat(result[1]).isEqualTo(1)
    }

    @Test
    fun test2() {
        val result = target.twoSum(nums = intArrayOf(3, 2, 4), target = 6)
        assertThat(result[0]).isEqualTo(1)
        assertThat(result[1]).isEqualTo(2)
    }

    @Test
    fun test3() {
        val result = target.twoSum(nums = intArrayOf(3, 3), target = 6)
        assertThat(result[0]).isEqualTo(0)
        assertThat(result[1]).isEqualTo(1)
    }
}
