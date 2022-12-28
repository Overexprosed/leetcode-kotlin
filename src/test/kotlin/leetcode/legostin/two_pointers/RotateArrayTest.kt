package leetcode.legostin.two_pointers

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class RotateArrayTest {

    private val target = RotateArray()

    @Test
    fun test1() {
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        target.rotate(array, 4)
        assertArrayEquals(intArrayOf(4, 5, 6, 7, 1, 2, 3), array)
    }

    @Test
    fun test2() {
        val array = intArrayOf(-1, -100, 3, 99)
        target.rotate(array, 2)
        assertArrayEquals(intArrayOf(3, 99, -1, -100), array)
    }

    @Test
    fun test3() {
        val array = intArrayOf(1, 2)
        target.rotate(array, 3)
        assertArrayEquals(intArrayOf(2, 1), array)
    }

    @Test
    fun test5() {
        val array = intArrayOf(-1)
        target.rotate(array, 3)
        assertArrayEquals(intArrayOf(-1), array)
    }

    @Test
    fun test6() {
        val array = intArrayOf(1, 2)
        target.rotate(array, 1)
        assertArrayEquals(intArrayOf(2, 1), array)
    }
}
