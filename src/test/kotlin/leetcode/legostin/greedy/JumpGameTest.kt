package leetcode.legostin.greedy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JumpGameTest {

    private val target = JumpGame()

    @Test
    fun test1() {
        val result = target.canJump(nums = intArrayOf(2, 3, 1, 1, 4))
        assertThat(result).isTrue
    }

    @Test
    fun test2() {
        val result = target.canJump(nums = intArrayOf(3, 2, 1, 0, 4))
        assertThat(result).isFalse
    }

    @Test
    fun test3() {
        val result = target.canJump(nums = intArrayOf(2, 0, 0))
        assertThat(result).isTrue
    }
}
