package leetcode.legostin.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GasStationTest {

    private val target = GasStation()

    @Test
    fun test1() {
        val gas = intArrayOf(1, 2, 3, 4, 5)
        val cost = intArrayOf(3, 4, 5, 1, 2)
        val result = target.canCompleteCircuit(gas, cost)
        assertEquals(3, result)
    }

    @Test
    fun test2() {
        val gas = intArrayOf(2, 3, 4)
        val cost = intArrayOf(3, 4, 3)
        val result = target.canCompleteCircuit(gas, cost)
        assertEquals(-1, result)
    }

    @Test
    fun test3() {
        val gas = intArrayOf(5, 1, 2, 3, 4)
        val cost = intArrayOf(4, 4, 1, 5, 1)
        val result = target.canCompleteCircuit(gas, cost)
        assertEquals(4, result)
    }
}
