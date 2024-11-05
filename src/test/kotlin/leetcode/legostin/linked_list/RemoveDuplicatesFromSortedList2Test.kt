package leetcode.legostin.linked_list

import leetcode.legostin.util.toListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedList2Test {

    private val target = RemoveDuplicatesFromSortedList2()

    @Test
    fun test1() {
        val head = "[1, 2, 3, 3, 4, 4, 5]".toListNode()
        val expected = "[1, 2, 5]".toListNode()

        assertEquals(expected, target.deleteDuplicates(head))
    }

    @Test
    fun test2() {
        val head = "[1, 1, 1, 2, 3]".toListNode()
        val expected = "[2, 3]".toListNode()

        assertEquals(expected, target.deleteDuplicates(head))
    }
}
