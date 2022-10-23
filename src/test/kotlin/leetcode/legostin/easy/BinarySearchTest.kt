package leetcode.legostin.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinarySearchTest {

    private val target = BinarySearch()

    @Test
    fun test1() {
        assertEquals(3, target.search(intArrayOf(-1, 0, 2, 5, 8), 5))
    }
}
