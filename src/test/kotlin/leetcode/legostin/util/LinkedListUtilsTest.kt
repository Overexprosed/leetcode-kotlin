package leetcode.legostin.util

import leetcode.legostin.util.LinkedListUtils.Companion.buildLinkedList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LinkedListUtilsTest {

    @Test
    fun test1() {
        val head = buildLinkedList(values = listOf(1, 2))

        assertThat(head.value).isEqualTo(1)
        assertThat(head.next!!.value).isEqualTo(2)
    }
}
