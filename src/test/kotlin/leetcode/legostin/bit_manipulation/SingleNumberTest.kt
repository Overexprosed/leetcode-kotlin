package leetcode.legostin.bit_manipulation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SingleNumberTest {

    private val target = SingleNumber()

    @Test
    fun test1() {
        val numbers = intArrayOf(1)
        val result = target.singleNumber(numbers)
        assertEquals(1, result)
    }

    @Test
    fun test2() {
        val numbers = intArrayOf(7, 3, 5, 1, 5, 3, 1)
        val result = target.singleNumber(numbers)
        assertEquals(7, result)
    }
}
