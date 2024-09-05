package leetcode.legostin.greedy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMovesTest {

    private val target = MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves()

    @Test
    fun test1() {
        target.minDifference(nums = intArrayOf(5, 3, 2, 4)).let {
            assertThat(it).isEqualTo(0)
        }
    }

    @Test
    fun test2() {
        target.minDifference(nums = intArrayOf(1, 5, 0, 10, 14)).let {
            assertThat(it).isEqualTo(1)
        }
    }

    @Test
    fun test3() {
        target.minDifference(nums = intArrayOf(3, 100, 20)).let {
            assertThat(it).isEqualTo(0)
        }
    }

    @Test
    fun test4() {
        target.minDifference(nums = intArrayOf(6, 6, 0, 1, 1, 4, 6)).let {
            assertThat(it).isEqualTo(2)
        }
    }
}
