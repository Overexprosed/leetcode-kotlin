package leetcode.legostin.linked_list

import leetcode.legostin.model.ListNode

/**
 * Remove Duplicates from Sorted List
 *
 * Given the head of a sorted linked list.
 * Delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 */
class RemoveDuplicatesFromSortedList {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return null

        var node = head
        while (node?.next != null) {
            if (node.value == node.next?.value) {
                node.next = node.next?.next
            } else {
                node = node.next
            }
        }

        return head
    }
}
