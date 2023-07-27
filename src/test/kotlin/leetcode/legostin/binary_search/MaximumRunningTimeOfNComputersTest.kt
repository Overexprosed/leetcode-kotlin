package leetcode.legostin.binary_search

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaximumRunningTimeOfNComputersTest {

    private val target = MaximumRunningTimeOfNComputers()

    @Test
    fun test1() {
        val result = target.maxRunTime(2, intArrayOf(3, 3, 3))
        assertThat(result).isEqualTo(4)
    }

    @Test
    fun test2() {
        val result = target.maxRunTime(2, intArrayOf(1, 1, 1, 1))
        assertThat(result).isEqualTo(2)
    }
}
