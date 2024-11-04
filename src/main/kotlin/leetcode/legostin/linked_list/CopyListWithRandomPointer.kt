package leetcode.legostin.linked_list

import leetcode.legostin.model.RandomNode

/**
 * Deep copy.
 */
class CopyListWithRandomPointer {

    fun copyRandomList(node: RandomNode?): RandomNode? {
        val map = mutableMapOf<RandomNode, RandomNode>()

        // Create new node for each original node
        var head: RandomNode? = node
        while (head != null) {
            map[head] = RandomNode(head.value)
            head = head.next
        }

        head = node

        while (head != null) {
            val newNode = map[head]!!
            newNode.next = map[head.next]
            newNode.random = map[head.random]

            head = head.next
        }
        
        return map[node]
    }
}
