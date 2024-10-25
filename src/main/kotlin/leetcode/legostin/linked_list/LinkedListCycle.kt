package leetcode.legostin.linked_list

import leetcode.legostin.model.ListNode

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list
 * that can be reached again by continuously following the next pointer.
 *
 * Return true if there is a cycle in the linked list.
 * Otherwise, return false.
 */
class LinkedListCycle {

    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next

            if (slow == fast) {
                return true
            }
        }

        return false
    }
}
