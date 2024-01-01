package leetcode.legostin.two_pointers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AssignCookiesTest {

    private val target = AssignCookies()

    @Test
    fun test1() {
        val result = target.findContentChildren(children = intArrayOf(1, 2, 3), cookies = intArrayOf(1, 1))
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun test2() {
        val result = target.findContentChildren(children = intArrayOf(1, 2), cookies = intArrayOf(1, 2, 3))
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun test3() {
        val result = target.findContentChildren(children = intArrayOf(10, 9, 8, 7), cookies = intArrayOf(5, 6, 7, 8))
        assertThat(result).isEqualTo(2)
    }
}
