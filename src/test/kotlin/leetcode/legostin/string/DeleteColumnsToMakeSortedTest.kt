package leetcode.legostin.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteColumnsToMakeSortedTest {

    private val target = DeleteColumnsToMakeSorted()

    @Test
    fun test1() {
        val strs = arrayOf("cba", "daf", "ghi")
        val result = target.minDeletionSize(strs)
        assertEquals(1, result)
    }

    @Test
    fun test2() {
        val strs = arrayOf("a", "b")
        val result = target.minDeletionSize(strs)
        assertEquals(0, result)
    }

    @Test
    fun test3() {
        val strs = arrayOf("zyx", "wvu", "tsr")
        val result = target.minDeletionSize(strs)
        assertEquals(3, result)
    }

    @Test
    fun test4() {
        val strs = arrayOf("rrjk", "furt", "guzm")
        val result = target.minDeletionSize(strs)
        assertEquals(2, result)
    }
}
