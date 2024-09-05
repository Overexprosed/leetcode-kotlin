package leetcode.legostin.util

import leetcode.legostin.model.ListNode
import leetcode.legostin.util.LinkedListUtils.Companion.buildListNode

class LinkedListUtils {

    companion object {

        fun buildListNode(values: List<Int>): ListNode {
            if (values.isEmpty()) {
                throw RuntimeException("values is empty")
            }

            val head = ListNode(value = values.first())
            var modify = head

            for (i in 1 until values.size) {
                modify.next = ListNode(value = values[i])
                modify = modify.next!!
            }

            return head
        }
    }
}

fun List<Int>.toListNode(): ListNode {
    return buildListNode(this)
}
