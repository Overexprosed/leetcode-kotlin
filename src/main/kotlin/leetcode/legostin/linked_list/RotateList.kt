package leetcode.legostin.linked_list

import leetcode.legostin.model.ListNode

class RotateList {

    /**
     * Example: [1, 2, 3, 4, 5] -> [4, 5, 1, 2, 3]
     */
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head?.next == null) return head

        val dummy = ListNode(0)
        dummy.next = head

        var fast: ListNode? = dummy
        var slow: ListNode? = dummy

        var length = 0 // length = 5
        while (fast?.next != null) { // Get the total length
            fast = fast.next
            length++
        }

        val stepsToMove = length - k % length // stepsToMove = 3
        for (j in stepsToMove downTo 1) { // Get the (length - n % length)th node
            slow = slow?.next
        }

        // slow = [3, 4, 5]
        // fast = [5]

        // Do the rotation
        fast?.next = dummy.next // connect end to the start
        dummy.next = slow?.next // make new head (see we return dummy.next)
        slow?.next = null // make new end

        return dummy.next
    }
}
