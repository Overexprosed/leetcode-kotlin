package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class IsomorphicStringTest {

    private val target = IsomorphicString()

    @Test
    fun test1() {
       val output = target.isIsomorphic("egg", "add")
        assertTrue(output)
    }

    @Test
    fun test2() {
        val output = target.isIsomorphic("foo", "bar")
        assertFalse(output)
    }

    @Test
    fun test3() {
        val output = target.isIsomorphic("paper", "title")
        assertTrue(output)
    }

    @Test
    fun test4() {
        val output = target.isIsomorphic("badc", "bada")
        assertFalse(output)
    }
}
