package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FindTheWinnerOfArrayGameTest {

    private val target = FindTheWinnerOfArrayGame()

    @Test
    fun test1() {
        val result = target.getWinner(arr = intArrayOf(2, 1, 3, 5, 4, 6, 7), k = 2)
        assertThat(result).isEqualTo(5)
    }

    @Test
    fun test2() {
        val result = target.getWinner(arr = intArrayOf(3, 2, 1), k = 10)
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun test3() {
        val result = target.getWinner(arr = intArrayOf(1, 11, 22, 33, 44, 55, 66, 77, 88, 99), k = 1000000000)
        assertThat(result).isEqualTo(99)
    }
}
