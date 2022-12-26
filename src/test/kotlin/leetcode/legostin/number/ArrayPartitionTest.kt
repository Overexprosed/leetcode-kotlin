package leetcode.legostin.number

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ArrayPartitionTest {

    private val target = ArrayPartition()

    @Test
    fun test1() {
        val result = target.arrayPairSum(intArrayOf(6, 2, 6, 5, 1, 2))
        assertEquals(9, result)
    }

    @Test
    fun test2() {
        val result = target.arrayPairSum(intArrayOf())
        assertEquals(0, result)
    }
}