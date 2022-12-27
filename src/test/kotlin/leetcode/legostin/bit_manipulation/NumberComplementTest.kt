package leetcode.legostin.bit_manipulation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberComplementTest {

    private val target = NumberComplement()

    @Test
    fun test1() {
        val result = target.findComplement(5)
        assertEquals(2, result)
    }

    @Test
    fun test2() {
        val result = target.findComplement(1)
        assertEquals(0, result)
    }

    @Test
    fun test3() {
        val result = target.findComplement(0)
        assertEquals(1, result)
    }

    @Test
    fun test4() {
        val result = target.findComplement(122)
        assertEquals(5, result)
    }
}
