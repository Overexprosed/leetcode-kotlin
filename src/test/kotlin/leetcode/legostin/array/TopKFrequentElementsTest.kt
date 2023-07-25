package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TopKFrequentElementsTest {

    private val target = TopKFrequentElements()

    @Test
    fun test1() {
        val result = target.topKFrequent(nums = intArrayOf(1, 1, 1, 2, 2, 3), k = 2)

        assertThat(result.size).isEqualTo(2)
        result.firstOrNull { it == 1 }!!
        result.firstOrNull { it == 2 }!!
    }

    @Test
    fun test2() {
        val result = target.topKFrequent(nums = intArrayOf(1), k = 1)

        assertThat(result.size).isEqualTo(1)
        result.firstOrNull { it == 1 }!!
    }

    @Test
    fun test3() {
        val result = target.topKFrequent(nums = intArrayOf(), k = 1)

        assertThat(result).isEmpty()
    }
}
