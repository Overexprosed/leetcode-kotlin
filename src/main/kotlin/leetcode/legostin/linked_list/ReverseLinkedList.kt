package leetcode.legostin.linked_list

import leetcode.legostin.model.ListNode

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
class ReverseLinkedList {

    fun reverseList(head: ListNode?): ListNode? {
        var currHead = head
        var prevHead: ListNode? = null

        while (currHead != null) {
            // save link to the next to continue ListNode iteration
            val next = currHead.next

            // swap
            currHead.next = prevHead
            prevHead = currHead

            currHead = next
        }

        return prevHead
    }
}
