package leetcode.legostin.stack

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarFleetTest {

    private val target = CarFleet()

    @Test
    fun test1() {
        val result = target.carFleet(
            target = 10,
            position = intArrayOf(1, 4),
            speed = intArrayOf(3, 2)
        )

        assertThat(result).isEqualTo(1)
    }

    @Test
    fun test2() {
        val result = target.carFleet(
            target = 10,
            position = intArrayOf(4, 1, 0, 7),
            speed = intArrayOf(2, 2, 1, 1)
        )

        assertThat(result).isEqualTo(3)
    }
}
