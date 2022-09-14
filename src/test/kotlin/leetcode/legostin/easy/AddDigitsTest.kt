package leetcode.legostin.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddDigitsTest {

    private val target = AddDigits()

    @Test
    fun test1() {
        val output = target.addDigits(38)
        assertEquals(2, output)
    }

    @Test
    fun test2() {
        val output = target.addDigits(9)
        assertEquals(9, output)
    }

    @Test
    fun test3() {
        val output = target.addDigits(0)
        assertEquals(0, output)
    }
}
