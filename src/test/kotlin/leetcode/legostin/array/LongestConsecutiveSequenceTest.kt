package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LongestConsecutiveSequenceTest {

    private val target = LongestConsecutiveSequence()

    @Test
    fun test1() {
        val result = target.longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2))
        assertThat(result).isEqualTo(4)
    }

    @Test
    fun test2() {
        val result = target.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1))
        assertThat(result).isEqualTo(9)
    }

    @Test
    fun test3() {
        val result = target.longestConsecutive(intArrayOf())
        assertThat(result).isEqualTo(0)
    }
}
