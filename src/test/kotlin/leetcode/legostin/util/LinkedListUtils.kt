package leetcode.legostin.util

import leetcode.legostin.model.ListNode

fun List<Int>.toListNode(): ListNode {
    if (this.isEmpty()) {
        throw RuntimeException("values is empty")
    }

    val head = ListNode(value = this.first())
    var modify = head

    for (i in 1 until this.size) {
        modify.next = ListNode(value = this[i])
        modify = modify.next!!
    }

    return head
}

fun ListNode.toListInt(): List<Int> {
    val result = mutableListOf<Int>()
    var node: ListNode? = this

    while (node != null) {
        result.add(node.value)
        node = node.next
    }

    return result
}

/**
 * Не рекомендуется вызывать над ListNode с петлей.
 */
fun ListNode.firstOrNull(value: Int): ListNode? {
    var node: ListNode? = this

    while (node != null) {
        if (node.value == value) {
            return node
        }

        node = node.next
    }

    return null
}
