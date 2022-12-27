package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TwoSumTest {

    private val target = TwoSum()

    @Test
    fun test1() {
        val testArray = intArrayOf(2, 7, 11, 15)
        val result = target.twoSum(testArray, 9)
        assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun test2() {
        val testArray = intArrayOf(3, 2, 4)
        val result = target.twoSum(testArray, 6)
        assertArrayEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun test3() {
        val testArray = intArrayOf(3, 3)
        val result = target.twoSum(testArray, 6)
        assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun test4() {
        val testArray = intArrayOf()
        val result = target.twoSum(testArray, 0)
        assertArrayEquals(intArrayOf(), result)
    }
}
