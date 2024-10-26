package leetcode.legostin.linked_list

import leetcode.legostin.model.ListNode

class AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
        val head = ListNode(0)
        var tail: ListNode? = head

        var list1 = l1
        var list2 = l2
        var carry = 0

        while (list1 != null || list2 != null || carry == 1) {
            val digit1 = list1?.value ?: 0
            val digit2 = list2?.value ?: 0

            val sum = digit1 + digit2 + carry
            val digit = sum % 10
            carry = sum / 10

            val newNode = ListNode(digit)
            tail?.next = newNode // build a listNode
            tail = newNode // new tail

            list1 = list1?.next
            list2 = list2?.next
        }

        return head.next ?: ListNode(0)
    }
}
