package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumRoundsCompleteAllTasksTest {

    private val target = MinimumRoundsCompleteAllTasks()

    @Test
    fun test1() {
        val result = target.minimumRounds(intArrayOf(2, 2, 3, 3, 2, 4, 4, 4, 4, 4))
        assertEquals(4, result)
    }
}
