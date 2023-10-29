package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CandyTest {

    private val target = Candy()

    @Test
    fun test1() {
        val result = target.candy(ratings = intArrayOf(1, 0, 2))
        assertThat(result).isEqualTo(5)
    }

    @Test
    fun test2() {
        val result = target.candy(ratings = intArrayOf(1, 2, 2))
        assertThat(result).isEqualTo(4)
    }

    @Test
    fun test3() {
        val result = target.candy(ratings = intArrayOf(1, 3, 2, 2, 1))
        assertThat(result).isEqualTo(7)
    }

    @Test
    fun test4() {
        val result = target.candy(ratings = intArrayOf(1, 2, 87, 87, 87, 2, 1))
        assertThat(result).isEqualTo(13)
    }
}
