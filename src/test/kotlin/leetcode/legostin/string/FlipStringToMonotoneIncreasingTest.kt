package leetcode.legostin.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FlipStringToMonotoneIncreasingTest {

    private val target = FlipStringToMonotoneIncreasing()

    @Test
    fun test1() {
        val result = target.minFlipsMonoIncr("00110")
        assertEquals(1, result)
    }

    @Test
    fun test2() {
        val result = target.minFlipsMonoIncr("010110")
        assertEquals(2, result)
    }

    @Test
    fun test3() {
        val result = target.minFlipsMonoIncr("00011000")
        assertEquals(2, result)
    }
}
