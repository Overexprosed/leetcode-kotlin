package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HIndexTest {

    private val target = HIndex()

    @Test
    fun test1() {
        val result = target.hIndex(citations = intArrayOf(3, 0, 6, 1, 5))
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun test2() {
        val result = target.hIndex(citations = intArrayOf(1, 3, 1))
        assertThat(result).isEqualTo(1)
    }
}
