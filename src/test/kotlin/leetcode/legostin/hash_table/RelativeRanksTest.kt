package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RelativeRanksTest {

    private val target = RelativeRanks()

    @Test
    fun test1() {
        val scores = intArrayOf(5, 4, 3, 2, 1)
        target.findRelativeRanks(scores).let { result ->
            assertEquals(result[0], "Gold Medal")
            assertEquals(result[1], "Silver Medal")
            assertEquals(result[2], "Bronze Medal")
            assertEquals(result[3], "4")
            assertEquals(result[4], "5")
        }
    }

    @Test
    fun test2() {
        val scores = intArrayOf(10, 3, 8, 9, 4)
        target.findRelativeRanks(scores).let { result ->
            assertEquals(result[0], "Gold Medal")
            assertEquals(result[1], "5")
            assertEquals(result[2], "Bronze Medal")
            assertEquals(result[3], "Silver Medal")
            assertEquals(result[4], "4")
        }
    }

    @Test
    fun test3() {
        val scores = intArrayOf()
        assertEquals(0, target.findRelativeRanks(scores).size)
    }
}
