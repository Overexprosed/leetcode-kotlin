package leetcode.legostin.easy

import leetcode.legostin.model.ListNode

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 *
 * Each time, slow go 1 steps while fast go 2 steps.
 * When fast arrives at the end, slow will arrive right in the middle.
 */
class MiddleOfTheLinkedList {

    fun middleNode(head: ListNode?): ListNode? {
        var slow = head
        var fast = head

        while (fast != null && fast.next != null) {
            slow = slow!!.next
            fast = fast.next!!.next
        }
        return slow
    }
}
