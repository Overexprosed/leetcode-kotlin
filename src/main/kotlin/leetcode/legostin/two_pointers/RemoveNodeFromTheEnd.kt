package leetcode.legostin.two_pointers

import leetcode.legostin.model.ListNode

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
class RemoveNodeFromTheEnd {

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var fast = head
        var slow = head

        for (i in 0 until n) {
            fast = fast?.next
        }
        // case when n == list.size (no way to find previous node to delete next, cause prev does not exist)
        if (fast == null) return head?.next
        while (fast?.next != null) {
            fast = fast.next
            slow = slow?.next
        }
        slow?.next = slow?.next?.next
        return head
    }
}
