@file:Suppress("unused")

package leetcode.legostin.linked_list

import leetcode.legostin.model.ListNode

class MergeNodesInBetweenZeros {

    fun mergeNodes(head: ListNode?): ListNode? {
        var modify = head?.next
        var nextSum = head?.next

        while (nextSum != null) {
            var sum = 0

            while (nextSum?.value != 0) {
                sum += nextSum?.value!!
                nextSum = nextSum.next
            }
            modify?.value = sum

            nextSum = nextSum.next

            modify = nextSum
            modify?.next = nextSum
        }

        return head?.next
    }
}
