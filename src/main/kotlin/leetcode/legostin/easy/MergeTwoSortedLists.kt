package leetcode.legostin.easy

import leetcode.legostin.model.ListNode

/**
 * Merge two sorted linked lists and return it as a new sorted list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
class MergeTwoSortedLists {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        return if (list1.value < list2.value) {
            list1.next = mergeTwoLists(list1.next, list2)
            list1
        } else {
            list2.next = mergeTwoLists(list1, list2.next)
            list2
        }
    }
}
