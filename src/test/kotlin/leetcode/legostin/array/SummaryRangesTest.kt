package leetcode.legostin.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SummaryRangesTest {

    private val target = SummaryRanges()

    @Test
    fun test1() {
        val expected = listOf("0->2", "4->5", "7")
        val actual = target.summaryRanges(nums = intArrayOf(0, 1, 2, 4, 5, 7))

        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val expected = listOf("0", "2->4", "6", "8->9")
        val actual = target.summaryRanges(nums = intArrayOf(0, 2, 3, 4, 6, 8, 9))

        assertEquals(expected, actual)
    }
}
