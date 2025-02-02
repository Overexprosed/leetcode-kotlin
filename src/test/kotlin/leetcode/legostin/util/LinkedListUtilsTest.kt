package leetcode.legostin.util

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LinkedListUtilsTest {

    @Test
    fun testFirstOrNull() {
        val listNode = "[5, 3, 6, 2, 7, 1, 4]".toListNode()

        val list = listNode.firstOrNull(6)!!
        assertThat(list.value).isEqualTo(6)
        assertThat(list.next!!.value).isEqualTo(2)
    }

    @Test
    fun testFirstOrNullWhenNodeNotExists() {
        val listNode = "[5, 3]".toListNode()

        val list = listNode.firstOrNull(9)
        assertThat(list).isNull()
    }
}
