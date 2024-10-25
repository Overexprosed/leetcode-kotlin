package leetcode.legostin.linked_list

import leetcode.legostin.util.firstOrNull
import leetcode.legostin.util.toListNode
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class LinkedListCycleTest {

    private val target = LinkedListCycle()

    @Test
    fun test1() {
        val listNode = listOf(5, 3, 6, 2, 7, 1, 4).toListNode()

        target.hasCycle(listNode).also { assertFalse(it) }

        // Make a cycle: take node with value 4 and connect it to the node with value 6
        val list4 = listNode.firstOrNull(4)!!
        val list6 = listNode.firstOrNull(6)
        list4.next = list6

        target.hasCycle(listNode).also { assertTrue(it) }
    }
}
