package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThreeConsecutiveOddsTest {

    private val target = ThreeConsecutiveOdds()

    @Test
    fun test1() {
        target.threeConsecutiveOdds(arr = intArrayOf(2, 6, 4, 1)).let {
            assertThat(it).isFalse
        }
    }

    @Test
    fun test2() {
        target.threeConsecutiveOdds(arr = intArrayOf(1, 2, 34, 3, 4, 5, 7, 23, 12)).let {
            assertThat(it).isTrue
        }
    }
}
