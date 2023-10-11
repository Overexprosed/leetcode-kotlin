package leetcode.legostin.heap

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumberOfFlowersInFullBloomTest {

    private val target = NumberOfFlowersInFullBloom()

    @Test
    fun test1() {
        val result = target.fullBloomFlowers(
            flowers = arrayOf(intArrayOf(1, 6), intArrayOf(3, 7), intArrayOf(9, 12), intArrayOf(4, 13)),
            people = intArrayOf(2, 3, 7, 11)
        )
        assertThat(result.size).isEqualTo(4)
        assertThat(result[0]).isEqualTo(1)
        assertThat(result[1]).isEqualTo(2)
        assertThat(result[2]).isEqualTo(2)
        assertThat(result[3]).isEqualTo(2)
    }

    @Test
    fun test2() {
        val result = target.fullBloomFlowers(
            flowers = arrayOf(intArrayOf(1, 10), intArrayOf(3, 3)),
            people = intArrayOf(3, 3, 2)
        )
        assertThat(result.size).isEqualTo(3)
        assertThat(result[0]).isEqualTo(2)
        assertThat(result[1]).isEqualTo(2)
        assertThat(result[2]).isEqualTo(1)
    }
}
