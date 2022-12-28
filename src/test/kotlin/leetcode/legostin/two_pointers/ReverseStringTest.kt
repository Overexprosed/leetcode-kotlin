package leetcode.legostin.two_pointers

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ReverseStringTest {

    private val target = ReverseString()

    @Test
    fun test1() {
        val str = "hello".toCharArray()
        target.reverseString(str)
        assertArrayEquals(charArrayOf('o', 'l', 'l', 'e', 'h'), str)
    }

    @Test
    fun test2() {
        val str = "".toCharArray()
        target.reverseString(str)
        assertArrayEquals(charArrayOf(), str)
    }
}
