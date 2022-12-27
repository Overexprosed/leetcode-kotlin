package leetcode.legostin.linked_list

import leetcode.legostin.model.ListNode

/**
 * Remove Duplicates from Sorted List
 *
 * Given the head of a sorted linked list.
 * Delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 * ---
 * Create 'list' as a temporal variable to not compromise an initial variable
 */
class RemoveDuplicatesFromSortedList {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return null

        var list = head
        while (list?.next != null) {
            if (list.value == list.next?.value) {
                list.next = list.next?.next
            } else {
                list = list.next
            }
        }
        return head
    }
}
