package leetcode.legostin.two_pointers

import leetcode.legostin.model.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MiddleOfTheLinkedListTest {

    private val target = MiddleOfTheLinkedList()

    @Test
    fun test1() {
        val head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        val result = target.middleNode(head)
        val expected = ListNode(3, ListNode(4, ListNode(5)))
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6))))))
        val result = target.middleNode(head)
        val expected = ListNode(4, ListNode(5, ListNode(6)))
        assertEquals(expected, result)
    }
}
