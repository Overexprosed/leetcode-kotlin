package leetcode.legostin.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AverageWaitingTimeTest {

    private val target = AverageWaitingTime()
    private val delta = 0.1

    @Test
    fun test1() {
        target.averageWaitingTime(
            customers = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 5),
                intArrayOf(4, 3)
            )
        ).let { assertEquals(5.00000, it, delta) }
    }

    @Test
    fun test2() {
        target.averageWaitingTime(
            customers = arrayOf(
                intArrayOf(5, 2),
                intArrayOf(5, 4),
                intArrayOf(10, 3),
                intArrayOf(20, 1)
            )
        ).let { assertEquals(3.25000, it, delta) }
    }
}
