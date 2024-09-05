package leetcode.legostin.greedy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IpoTest {

    private val target = Ipo()

    @Test
    fun test1() {
        target.findMaximizedCapital(
            k = 2,
            w = 0,
            profits = intArrayOf(1, 2, 3),
            capital = intArrayOf(0, 1, 1)
        ).let {
            assertThat(it).isEqualTo(4)
        }
    }

    @Test
    fun test2() {
        target.findMaximizedCapital(
            k = 3,
            w = 0,
            profits = intArrayOf(1, 2, 3),
            capital = intArrayOf(0, 1, 2)
        ).let {
            assertThat(it).isEqualTo(6)
        }
    }

    @Test
    fun test3() {
        target.findMaximizedCapital(
            k = 1,
            w = 0,
            profits = intArrayOf(1, 2, 3),
            capital = intArrayOf(1, 1, 2)
        ).let {
            assertThat(it).isEqualTo(0)
        }
    }
}
