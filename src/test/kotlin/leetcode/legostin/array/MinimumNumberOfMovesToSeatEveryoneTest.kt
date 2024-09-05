package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinimumNumberOfMovesToSeatEveryoneTest {

    private val target = MinimumNumberOfMovesToSeatEveryone()

    @Test
    fun test1() {
        target.minMovesToSeat(seats = intArrayOf(4, 1, 5, 9), students = intArrayOf(1, 3, 2, 6)).let {
            assertThat(it).isEqualTo(7)
        }
    }

    @Test
    fun test2() {
        target.minMovesToSeat(seats = intArrayOf(2, 2, 6, 6), students = intArrayOf(1, 3, 2, 6)).let {
            assertThat(it).isEqualTo(4)
        }
    }
}
