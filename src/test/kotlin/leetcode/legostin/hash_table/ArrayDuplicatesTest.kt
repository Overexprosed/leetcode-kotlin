package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ArrayDuplicatesTest {

    private val target = ArrayDuplicates()

    @Test
    fun test1() {
        val result = target.findDuplicates(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1))
        assertEquals(listOf(2, 3), result)
    }

    @Test
    fun test2() {
        val result = target.findDuplicates(intArrayOf(1, 2, 3))
        assertEquals(listOf<Int>(), result)
    }

    @Test
    fun test3() {
        val result = target.findDuplicates(intArrayOf(1, 1, 2, 3, 3))
        assertEquals(listOf(1, 3), result)
    }
}
