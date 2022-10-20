package leetcode.legostin.easy

import leetcode.legostin.easy.model.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class MergeTwoSortedListsTest {
    private val target = MergeTwoSortedLists()

    @Test
    fun test1() {
        val l1 = ListNode() // []
        val l2 = ListNode() // []
        val result: ListNode? = target.mergeTwoLists(l1, l2)
        assertNotNull(result)
    }

    @Test
    fun test2() {
        val l1 = ListNode() // []
        val l2 = ListNode(0) // [0]
        val result: ListNode? = target.mergeTwoLists(l1, l2)
        val expected: ListNode = createListFromValues(listOf(0, 0))
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val l1 = ListNode(1, ListNode(2, ListNode(4))) // [1,2,4]
        val l2 = ListNode(1, ListNode(3, ListNode(4))) // [1,3,4]
        val result: ListNode? = target.mergeTwoLists(l1, l2)
        System.out.println("Result = " + result.hashCode())
        val expected: ListNode = createListFromValues(listOf(1, 1, 2, 3, 4, 4))
        assertEquals(expected, result)
    }

    @Test
    fun test4() {
        val l1 = ListNode() // []
        val l2 = ListNode(
            1,
            ListNode(
                9,
                ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9))))))))
            )
        ) // [1,9,9,9,9,9,9,9,9,9]
        val result: ListNode? = target.mergeTwoLists(l1, l2)
        val expected: ListNode = createListFromValues(listOf(0, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9))
        assertEquals(expected, result)
    }

    @Test
    fun test5() {
        val l1 = ListNode(1, ListNode(4, ListNode(5))) // [1,4,5]
        val l2 = ListNode(2, ListNode(3, ListNode(6))) // [2,3,6]
        val result: ListNode? = target.mergeTwoLists(l1, l2)
        val expected: ListNode = createListFromValues(listOf(1, 2, 3, 4, 5, 6))
        assertEquals(expected, result)
    }

    private fun createListFromValues(values: List<Int?>?): ListNode {
        if (values == null) {
            return ListNode()
        }
        if (values.size == 0) {
            return ListNode()
        }
        val head = ListNode(values[0]!!)
        var tail = head
        for (i in 1 until values.size) {
            val newList = ListNode(values[i]!!)
            tail.next = newList
            tail = newList
        }
        return head
    }
}
