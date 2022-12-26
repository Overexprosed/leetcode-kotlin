package leetcode.legostin.number

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DisappearedNumbersTest {

    private val target = DisappearedNumbers()

    @Test
    fun test1() {
        val result = target.findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1))
        assertEquals(listOf(5, 6), result)
    }

    @Test
    fun test2() {
        val result = target.findDisappearedNumbers(intArrayOf(1, 1))
        assertEquals(listOf(2), result)
    }

    @Test
    fun test3() {
        val result = target.findDisappearedNumbers(intArrayOf(1, 2))
        assertEquals(listOf<Int>(), result)
    }

    @Test
    fun test4() {
        val result = target.findDisappearedNumbers(intArrayOf(3, 3, 3, 3))
        assertEquals(listOf(1, 2, 4), result)
    }
}
