package leetcode.legostin.linked_list

import leetcode.legostin.model.ListNode

class ReverseLinkedList2 {

    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (left == right) return head
        var result: ListNode? = null

        var counter = 1 // index of current ListNode
        var startReverse: ListNode? = null
        var endReverse: ListNode? = null

        var beforeStartReverse: ListNode? = head

        var currentNode = head
        while (currentNode != null) {
            when (counter) {
                left -> startReverse = currentNode
                right -> endReverse = currentNode
                else -> {
                    // save node to connect first part with the reversed part
                    if (startReverse == null) {
                        beforeStartReverse = currentNode
                    }
                }
            }

            if (startReverse != null && endReverse != null) {
                // "Cut" next link to prevent reversion of the whole left list
                val next = currentNode.next
                endReverse.next = null

                reverseList(startReverse)
                // After reversion startReverse moved to the right, endReverse moved to the left

                startReverse.next = next // startReverse became the end. Connect list again

                if (left == 1) { // if reversion from start, endReverse become start and should be marked as head
                    result = endReverse
                } else {
                    beforeStartReverse?.next = endReverse // connect first part with the reversed part
                    result = head
                }

                break
            }

            currentNode = currentNode.next
            counter++
        }

        return result
    }

    private fun reverseList(head: ListNode?): ListNode? {
        var currHead = head
        var prevHead: ListNode? = null

        while (currHead != null) {
            // save link to the next to continue ListNode iteration
            val next = currHead.next

            // swap
            currHead.next = prevHead
            prevHead = currHead

            currHead = next
        }

        return prevHead
    }
}
