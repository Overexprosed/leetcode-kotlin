package leetcode.legostin.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ArrangingCoinsTest {

    private val target = ArrangingCoins()

    @Test
    fun test1() {
        val result = target.arrangeCoins(1)
        assertEquals(1, result)
    }

    @Test
    fun test2() {
        val result = target.arrangeCoins(2)
        assertEquals(1, result)
    }

    @Test
    fun test3() {
        val result = target.arrangeCoins(3)
        assertEquals(2, result)
    }

    @Test
    fun test4() {
        val result = target.arrangeCoins(4)
        assertEquals(2, result)
    }

    @Test
    fun test5() {
        val result = target.arrangeCoins(5)
        assertEquals(2, result)
    }

    @Test
    fun test6() {
        val result = target.arrangeCoins(6)
        assertEquals(3, result)
    }
}
