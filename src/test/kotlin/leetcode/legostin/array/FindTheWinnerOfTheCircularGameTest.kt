package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FindTheWinnerOfTheCircularGameTest {

    private val target = FindTheWinnerOfTheCircularGame()

    @Test
    fun test1() {
        target.findTheWinner(n = 5, k = 2).let {
            assertThat(it).isEqualTo(3)
        }
    }

    @Test
    fun test2() {
        target.findTheWinner(n = 6, k = 5).let {
            assertThat(it).isEqualTo(1)
        }
    }
}
