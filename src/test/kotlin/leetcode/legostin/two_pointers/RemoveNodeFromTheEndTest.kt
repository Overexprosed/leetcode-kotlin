package leetcode.legostin.two_pointers

import leetcode.legostin.model.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class RemoveNodeFromTheEndTest {

    private val target = RemoveNodeFromTheEnd()

    @Test
    fun test1() {
        val list = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        val result = target.removeNthFromEnd(list, 2)
        assertEquals(
            ListNode(1, ListNode(2, ListNode(3, ListNode(5)))),
            result
        )
    }

    @Test
    fun test2() {
        val list = ListNode(1)
        val result = target.removeNthFromEnd(list, 1)
        assertNull(result)
    }

    @Test
    fun test3() {
        val list = ListNode(1, ListNode(2))
        val result = target.removeNthFromEnd(list, 1)
        assertEquals(
            ListNode(1),
            result
        )
    }

    @Test
    fun test4() {
        val list = ListNode(1, ListNode(2))
        val result = target.removeNthFromEnd(list, 2)
        assertEquals(
            ListNode(2),
            result
        )
    }
}
