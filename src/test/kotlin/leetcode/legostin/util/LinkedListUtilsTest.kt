package leetcode.legostin.util

import leetcode.legostin.util.LinkedListUtils.Companion.buildListNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LinkedListUtilsTest {

    @Test
    fun test1() {
        val head = buildListNode(values = listOf(1, 2))

        assertThat(head.value).isEqualTo(1)
        assertThat(head.next!!.value).isEqualTo(2)

        head.toValueList().let { assertThat(it).isEqualTo(listOf(1, 2)) }
    }
}
