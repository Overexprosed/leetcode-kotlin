package leetcode.legostin.linked_list

import leetcode.legostin.util.toListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RotateListTest {

    private val target = RotateList()

    @Test
    fun test1() {
        val head = "[1, 2, 3, 4, 5]".toListNode()
        val expected = "[4, 5, 1, 2, 3]".toListNode()

        target.rotateRight(head, 2).also { assertEquals(expected, it) }
    }

    @Test
    fun test2() {
        val head = "[0, 1, 2]".toListNode()
        val expected = "[2, 0, 1]".toListNode()

        target.rotateRight(head, 4).also { assertEquals(expected, it) }
    }
}
