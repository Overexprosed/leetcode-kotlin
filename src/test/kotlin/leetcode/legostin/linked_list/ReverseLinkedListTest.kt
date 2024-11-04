package leetcode.legostin.linked_list

import leetcode.legostin.util.toListNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReverseLinkedListTest {

    private val target = ReverseLinkedList()

    @Test
    fun test1() {
        val head = "[1, 2, 3]".toListNode()
        val expected = "[3, 2, 1]".toListNode()

        target.reverseList(head).also { assertThat(it).isEqualTo(expected) }
    }
}
