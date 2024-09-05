package leetcode.legostin.binary_search

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinimumNumberOfDaysToMakeMBouquetsTest {

    private val target = MinimumNumberOfDaysToMakeMBouquets()

    @Test
    fun test1() {
        target.minDays(
            bloomDay = intArrayOf(1, 10, 3, 10, 2),
            m = 3,
            k = 1
        ).let {
            assertThat(it).isEqualTo(3)
        }
    }

    @Test
    fun test2() {
        target.minDays(
            bloomDay = intArrayOf(1, 10, 3, 10, 2),
            m = 3,
            k = 2
        ).let {
            assertThat(it).isEqualTo(-1)
        }
    }

    @Test
    fun test3() {
        target.minDays(
            bloomDay = intArrayOf(7, 7, 7, 7, 12, 7, 7),
            m = 2,
            k = 3
        ).let {
            assertThat(it).isEqualTo(12)
        }
    }
}
