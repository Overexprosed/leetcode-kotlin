package leetcode.legostin.binary_search

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SearchInsertPositionTest {

    private val target = SearchInsertPosition()

    @Test
    fun test1() {
        val array = intArrayOf(1, 3, 5, 6)
        val target = 5
        val result = this.target.searchInsert(array, target)
        assertEquals(2, result)
    }

    @Test
    fun test2() {
        val array = intArrayOf(1, 3, 5, 6)
        val target = 2
        val result = this.target.searchInsert(array, target)
        assertEquals(1, result)
    }

    @Test
    fun test3() {
        val array = intArrayOf(1, 3, 5, 6)
        val target = 7
        val result = this.target.searchInsert(array, target)
        assertEquals(4, result)
    }

    @Test
    fun test4() {
        val array = intArrayOf()
        val target = 1
        val result = this.target.searchInsert(array, target)
        assertEquals(0, result)
    }

    @Test
    fun test5() {
        val array = intArrayOf(2)
        val target = 1
        val result = this.target.searchInsert(array, target)
        assertEquals(0, result)
    }

    @Test
    fun test6() {
        val array = intArrayOf(2)
        val target = 3
        val result = this.target.searchInsert(array, target)
        assertEquals(1, result)
    }
}
