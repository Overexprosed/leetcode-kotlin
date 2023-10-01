package leetcode.legostin.two_pointers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThreeSumTest {

    private val target = ThreeSum()

    @Test
    fun test1() {
        val result = target.threeSum(nums = intArrayOf(-1, 0, 1, 2, -1, -4))

        assertThat(result.size).isEqualTo(2)
    }
}
