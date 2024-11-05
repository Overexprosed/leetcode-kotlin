package leetcode.legostin.two_pointers

import leetcode.legostin.util.toListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class RemoveNodeFromTheEndTest {

    private val target = RemoveNodeFromTheEnd()

    @Test
    fun test1() {
        val head = "[1, 2, 3, 4, 5]".toListNode()
        val expected = "[1, 2, 3, 5]".toListNode()
        val actual = target.removeNthFromEnd(head, 2)

        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val head = "[1]".toListNode()
        target.removeNthFromEnd(head, 1).also { assertNull(it) }
    }

    @Test
    fun test3() {
        val head = "[1, 2]".toListNode()
        val expected = "[1]".toListNode()
        val actual = target.removeNthFromEnd(head, 1)

        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val head = "[1, 2]".toListNode()
        val expected = "[2]".toListNode()
        val actual = target.removeNthFromEnd(head, 2)

        assertEquals(expected, actual)
    }
}
