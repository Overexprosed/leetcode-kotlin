package leetcode.legostin.hash_table

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MajorityElementTest {

    private val target = MajorityElement()

    @Test
    fun test1() {
        val result = target.majorityElement(nums = intArrayOf(3, 2, 3))

        assertThat(result.size).isEqualTo(1)
        assertThat(result[0]).isEqualTo(3)
    }

    @Test
    fun test2() {
        val result = target.majorityElement(nums = intArrayOf(1))

        assertThat(result.size).isEqualTo(1)
        assertThat(result[0]).isEqualTo(1)
    }

    @Test
    fun test3() {
        val result = target.majorityElement(nums = intArrayOf(1, 2))

        assertThat(result.size).isEqualTo(2)
        assertThat(result.contains(1)).isTrue
        assertThat(result.contains(2)).isTrue
    }
}
