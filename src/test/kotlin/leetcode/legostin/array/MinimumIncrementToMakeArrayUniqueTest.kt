package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinimumIncrementToMakeArrayUniqueTest {

    private val target = MinimumIncrementToMakeArrayUnique()

    @Test
    fun test1() {
        target.minIncrementForUnique(nums = intArrayOf(1, 2, 2)).let {
            assertThat(it).isEqualTo(1)
        }
    }

    @Test
    fun test2() {
        target.minIncrementForUnique(nums = intArrayOf(3, 2, 1, 2, 1, 7)).let {
            assertThat(it).isEqualTo(6)
        }
    }
}
