package leetcode.legostin.greedy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JumpGame2Test {

    private val target = JumpGame2()

    @Test
    fun test1() {
        val result = target.jump(nums = intArrayOf(2, 3, 1, 1, 4))
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun test2() {
        val result = target.jump(nums = intArrayOf(2, 3, 0, 1, 4))
        assertThat(result).isEqualTo(2)
    }
}
