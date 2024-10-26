package leetcode.legostin.linked_list

import leetcode.legostin.util.toListInt
import leetcode.legostin.util.toListNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddTwoNumbersTest {

    private val target = AddTwoNumbers()

    @Test
    fun test1() {
        val list1 = listOf(2, 4, 3).toListNode()
        val list2 = listOf(5, 6, 4).toListNode()

        target.addTwoNumbers(list1, list2).toListInt().also { assertThat(it).isEqualTo(listOf(7, 0, 8)) }
    }

    @Test
    fun test2() {
        val list1 = listOf(0).toListNode()
        val list2 = listOf(0).toListNode()

        target.addTwoNumbers(list1, list2).toListInt().also { assertThat(it).isEqualTo(listOf(0)) }
    }
}
