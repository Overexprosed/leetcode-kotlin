package leetcode.legostin.linked_list

import leetcode.legostin.model.ListNode

class RemoveDuplicatesFromSortedList2 {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return null

        // if we have to remove duplicates from the start
        val fakeHead = ListNode(0)
        fakeHead.next = head

        var previous: ListNode? = fakeHead
        var current: ListNode? = head

        while (current != null) {
            // move the current pointer to the end of duplicates
            while (current?.next != null && current.value == current.next!!.value) {
                current = current.next
            }

            // if no duplicates were found, move the pre pointer
            if (previous?.next == current) {
                previous = previous?.next
            } else {
                // skip the duplicates
                previous?.next = current?.next
            }

            current = current?.next
        }

        return fakeHead.next
    }
}
