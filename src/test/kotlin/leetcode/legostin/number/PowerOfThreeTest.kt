package leetcode.legostin.number

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PowerOfThreeTest {

    private val target = PowerOfThree()

    @Test
    fun test1() {
        assertTrue(target.isPowerOfThree(3))
    }

    @Test
    fun test2() {
        assertTrue(target.isPowerOfThree(9))
    }

    @Test
    fun test3() {
        assertTrue(target.isPowerOfThree(27))
    }

    @Test
    fun test4() {
        assertFalse(target.isPowerOfThree(28))
    }

    @Test
    fun test5() {
        assertTrue(target.isPowerOfThree(1))
    }

    @Test
    fun test6() {
        assertFalse(target.isPowerOfThree(0))
    }

    @Test
    fun test7() {
        assertFalse(target.isPowerOfThree(Int.MAX_VALUE))
    }
}
