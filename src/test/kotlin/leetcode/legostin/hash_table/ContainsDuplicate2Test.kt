package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ContainsDuplicate2Test {

    private val target = ContainsDuplicate2()

    @Test
    fun test1() {
        target
            .containsNearbyDuplicate(nums = intArrayOf(1, 2, 3, 1), k = 3)
            .also { assertTrue(it) }
    }

    @Test
    fun test2() {
        target
            .containsNearbyDuplicate(nums = intArrayOf(1, 0, 1, 1), k = 1)
            .also { assertTrue(it) }
    }

    @Test
    fun test3() {
        target
            .containsNearbyDuplicate(nums = intArrayOf(1, 2, 3, 1, 2, 3), k = 2)
            .also { assertFalse(it) }
    }
}
