package leetcode.legostin.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class PlusOneTest {

    private val target = PlusOne()

    @Test
    fun test1() {
        val testArray = intArrayOf(1, 2, 3)
        assertArrayEquals(intArrayOf(1, 2, 4), target.plusOne(testArray))
    }

    @Test
    fun test2() {
        val testArray = intArrayOf(4, 3, 2, 1)
        val expectedArray = intArrayOf(4, 3, 2, 2)
        assertArrayEquals(expectedArray, target.plusOne(testArray))
    }

    @Test
    fun test3() {
        val testArray = intArrayOf(0)
        assertArrayEquals(intArrayOf(1), target.plusOne(testArray))
    }

    @Test
    fun test4() {
        val testArray = intArrayOf(9)
        assertArrayEquals(intArrayOf(1, 0), target.plusOne(testArray))
    }
}
