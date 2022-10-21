package leetcode.legostin.easy

import leetcode.legostin.easy.model.ListNode

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
class ReverseLinkedList {

    fun reverseList(head: ListNode?): ListNode? {
        var currHead = head
        var prevHead: ListNode? = null
        while (currHead != null) {
            val next = currHead.next
            currHead.next = prevHead
            prevHead = currHead
            currHead = next
        }
        return prevHead
    }
}
