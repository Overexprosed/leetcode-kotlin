package leetcode.legostin.two_pointers

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MoveZeroesTest {

    private val target = MoveZeroes()

    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        target.moveZeroes(nums)
        assertArrayEquals(intArrayOf(1, 2, 3), nums)
    }
}
