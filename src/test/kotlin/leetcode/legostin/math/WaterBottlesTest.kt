package leetcode.legostin.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WaterBottlesTest {

    private val target = WaterBottles()

    @Test
    fun test1() {
        target.numWaterBottles(
            numBottles = 9,
            numExchange = 3
        ).let {
            assertThat(it).isEqualTo(13)
        }
    }

    @Test
    fun test2() {
        target.numWaterBottles(
            numBottles = 15,
            numExchange = 4
        ).let {
            assertThat(it).isEqualTo(19)
        }
    }
}
