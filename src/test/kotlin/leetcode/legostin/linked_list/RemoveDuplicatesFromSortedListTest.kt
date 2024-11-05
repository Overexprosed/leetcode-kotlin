package leetcode.legostin.linked_list

import leetcode.legostin.util.toListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedListTest {

    private val target = RemoveDuplicatesFromSortedList()

    @Test
    fun test1() {
        val head = "[1, 1, 2]".toListNode()
        val expected = "[1, 2]".toListNode()

        assertEquals(expected, target.deleteDuplicates(head))
    }

    @Test
    fun test2() {
        val head = "[1, 1, 2, 3, 3]".toListNode()
        val expected = "[1, 2, 3]".toListNode()

        assertEquals(expected, target.deleteDuplicates(head))
    }

    @Test
    fun test3() {
        val head = "[1]".toListNode()
        val expected = "[1]".toListNode()

        assertEquals(expected, target.deleteDuplicates(head))
    }

    @Test
    fun test4() {
        val head = "[3, 3]".toListNode()
        val expected = "[3]".toListNode()

        assertEquals(expected, target.deleteDuplicates(head))
    }
}
