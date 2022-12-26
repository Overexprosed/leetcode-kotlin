package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class IntersectionOfTwoArraysTest {

    private val target = IntersectionOfTwoArrays()

    @Test
    fun test1() {
        val result = target.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))
        assertArrayEquals(intArrayOf(2), result)
    }

    @Test
    fun test2() {
        val result = target.intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4))
        assertArrayEquals(intArrayOf(9, 4), result)
    }
}
