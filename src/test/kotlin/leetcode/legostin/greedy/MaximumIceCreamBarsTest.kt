package leetcode.legostin.greedy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumIceCreamBarsTest {

    private val target = MaximumIceCreamBars()

    @Test
    fun test1() {
        val costs = intArrayOf(1, 3, 2, 4, 1)
        val result = target.maxIceCream(costs, 7)
        assertEquals(result, 4)
    }

    @Test
    fun test2() {
        val costs = intArrayOf(10, 6, 8, 7, 7, 8)
        val result = target.maxIceCream(costs, 5)
        assertEquals(result, 0)
    }

    @Test
    fun test3() {
        val costs = intArrayOf(1, 6, 3, 1, 2, 5)
        val result = target.maxIceCream(costs, 20)
        assertEquals(result, 6)
    }

    @Test
    fun test4() {
        val costs = intArrayOf()
        val result = target.maxIceCream(costs, 20)
        assertEquals(result, 0)
    }

    @Test
    fun test5() {
        val costs = intArrayOf(1, 6, 3, 1, 2, 5)
        val result = target.maxIceCream(costs, 0)
        assertEquals(result, 0)
    }
}
