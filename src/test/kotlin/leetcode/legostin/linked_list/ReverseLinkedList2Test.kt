package leetcode.legostin.linked_list

import leetcode.legostin.util.toListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseLinkedList2Test {

    private val target = ReverseLinkedList2()

    @Test
    fun test1() {
        val head = "[1, 2, 3, 4, 5]".toListNode()
        val expected = "[1, 4, 3, 2, 5]".toListNode()

        target.reverseBetween(head = head, left = 2, right = 4).also { assertEquals(expected, it) }
    }

    @Test
    fun test2() {
        val head = "[5]".toListNode()
        val expected = "[5]".toListNode()

        target.reverseBetween(head = head, left = 1, right = 1).also { assertEquals(expected, it) }
    }

    @Test
    fun test3() {
        val head = "[3, 5]".toListNode()
        val expected = "[5, 3]".toListNode()

        target.reverseBetween(head = head, left = 1, right = 2).also { assertEquals(expected, it) }
    }

    @Test
    fun test4() {
        val head = "[3, 5, 7]".toListNode()
        val expected = "[5, 3, 7]".toListNode()

        target.reverseBetween(head = head, left = 1, right = 2).also { assertEquals(expected, it) }
    }
}
