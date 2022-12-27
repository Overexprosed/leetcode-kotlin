package leetcode.legostin.number

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PowerOfTwoTest {

    private val target = PowerOfTwo()

    @Test
    fun test1() {
        assertTrue(target.isPowerOfTwo(1))
    }

    @Test
    fun test2() {
        assertTrue(target.isPowerOfTwo(2))
    }

    @Test
    fun test3() {
        assertTrue(target.isPowerOfTwo(4))
    }

    @Test
    fun test4() {
        assertTrue(target.isPowerOfTwo(16))
    }

    @Test
    fun test5() {
        assertFalse(target.isPowerOfTwo(3))
    }
}
