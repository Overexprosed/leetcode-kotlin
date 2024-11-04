package leetcode.legostin.linked_list

import leetcode.legostin.model.RandomNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CopyListWithRandomPointerTest {

    private val target = CopyListWithRandomPointer()

    @Test
    fun test1() {
        val list5 = RandomNode(value = 1)
        val list4 = RandomNode(value = 10, next = list5)
        val list3 = RandomNode(value = 11, next = list4)
        val list2 = RandomNode(value = 13, next = list3)
        val list1 = RandomNode(value = 7, next = list2)

        list1.random = null
        list2.random = list1
        list3.random = list5
        list4.random = list3
        list5.random = list1

        val originNodeString = prettyPrint(list1)
        val newNodeString = prettyPrint(target.copyRandomList(list1)!!)

        assertEquals(originNodeString, newNodeString)
    }

    /**
     * Each node will be represented as its value and index to the random node.
     *
     * For example:
     *   val node1 = RandomNode(1)
     *   val node2 = RandomNode(5, node1)
     *   Pretty print: [1, null], [5, 0]
     */
    private fun prettyPrint(node: RandomNode): String {
        val strings = mutableListOf<String>()
        val nodeToIndexMap = mutableMapOf<RandomNode, Int>()

        var head: RandomNode? = node
        var index = 0

        // init nodeToIndexMap
        while (head != null) {
            nodeToIndexMap[head] = index++
            head = head.next
        }

        head = node
        // construct string representation of each node
        while (head != null) {
            val value = head.value
            val randomIndex = head.random?.let { nodeToIndexMap[it]?.toString() ?: "" } ?: "null"

            strings.add("[$value, $randomIndex]")
            head = head.next
        }

        return strings.joinToString(", ")
    }
}
