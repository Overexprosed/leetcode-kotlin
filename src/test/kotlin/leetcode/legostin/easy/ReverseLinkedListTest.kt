package leetcode.legostin.easy

import leetcode.legostin.easy.model.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseLinkedListTest {

    private val target = ReverseLinkedList()

    @Test
    fun test1() {
        val head = ListNode(1, ListNode(2, ListNode(3)))
        val expected = ListNode(3, ListNode(2, ListNode(1)))
        val result: ListNode? = target.reverseList(head)
        assertEquals(expected, result)
    }
}
