package leetcode.legostin.linked_list

import leetcode.legostin.model.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedListTest {

    private val target = RemoveDuplicatesFromSortedList()

    @Test
    fun test1() {
        val testNode = ListNode(1, ListNode(1, ListNode(2))) // [1, 1, 2]
        val expectedNode = ListNode(1, ListNode(2))
        assertEquals(expectedNode, target.deleteDuplicates(testNode))
    }

    @Test
    fun test2() {
        val testNode = ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(3))))) // [1, 1, 2, 3, 3]
        val expectedNode = ListNode(1, ListNode(2, ListNode(3)))
        assertEquals(expectedNode, target.deleteDuplicates(testNode))
    }

    @Test
    fun test3() {
        val testNode = ListNode(1)
        val expectedNode = ListNode(1)
        assertEquals(expectedNode, target.deleteDuplicates(testNode))
    }

    @Test
    fun test4() {
        val testNode = ListNode(3, ListNode(3))
        val expectedNode = ListNode(3)
        assertEquals(expectedNode, target.deleteDuplicates(testNode))
    }
}
