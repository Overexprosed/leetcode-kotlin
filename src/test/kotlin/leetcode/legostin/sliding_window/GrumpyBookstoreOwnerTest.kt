package leetcode.legostin.sliding_window

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GrumpyBookstoreOwnerTest {

    private val target = GrumpyBookstoreOwner()

    @Test
    fun test1() {
        target.maxSatisfied(
            customers = intArrayOf(1, 0, 1, 2, 1, 1, 7, 5),
            grumpy = intArrayOf(0, 1, 0, 1, 0, 1, 0, 1),
            minutes = 3
        ).let {
            assertThat(it).isEqualTo(16)
        }
    }

    @Test
    fun test2() {
        target.maxSatisfied(
            customers = intArrayOf(1),
            grumpy = intArrayOf(0),
            minutes = 1
        ).let {
            assertThat(it).isEqualTo(1)
        }
    }
}
