package leetcode.legostin.fibonacci

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ClimbingStairsTest {

    private val target = ClimbingStairs()

    @Test
    fun test1() {
        val result = target.climbStairs(3)
        assertEquals(3, result)
    }

    @Test
    fun test2() {
        val result = target.climbStairs(4)
        assertEquals(5, result)
    }

    @Test
    fun test3() {
        val result = target.climbStairs(5)
        assertEquals(8, result)
    }
}
