package leetcode.legostin.medium

import leetcode.legostin.model.ListNode

/**
 * Given head, the head of a linked list.
 * Determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list,
 * that can be reached again by continuously following the next pointer.
 *
 * Fast and slow algorithm.
 */
class LinkedListCycle2 {

    fun detectCycle(head: ListNode?): ListNode? {
        var headNode = head

        var slow = headNode
        var fast = headNode

        // detect the cycle
        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next

            if (slow == fast) {
                break
            }
        }
        if (fast?.next == null) return null

        while (headNode != slow) {
            headNode = headNode?.next
            slow = slow?.next
        }
        return headNode
    }
}
