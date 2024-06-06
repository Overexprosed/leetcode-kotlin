package leetcode.legostin.greedy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HandOfStraightsTest {

    private val target = HandOfStraights()

    @Test
    fun test1() {
        target.isNStraightHand(hand = intArrayOf(1, 2, 3, 6, 2, 3, 4, 7, 8), groupSize = 3).let {
            assertThat(it).isTrue
        }
    }

    @Test
    fun test2() {
        target.isNStraightHand(hand = intArrayOf(1, 2, 3, 4, 5), groupSize = 4).let {
            assertThat(it).isFalse
        }
    }
}
