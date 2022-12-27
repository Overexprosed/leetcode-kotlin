package leetcode.legostin.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidParenthesesTest {

    private val target = ValidParentheses()

    @Test
    fun test1() {
        assertTrue(target.isValid("()"))
    }

    @Test
    fun test2() {
        assertFalse(target.isValid("(}"))
    }

    @Test
    fun test3() {
        assertTrue(target.isValid("[]"))
    }

    @Test
    fun test4() {
        assertTrue(target.isValid("{}"))
    }

    @Test
    fun test5() {
        assertTrue(target.isValid("(){}[]"))
    }

    @Test
    fun test6() {
        assertTrue(target.isValid("({([])})"))
    }

    @Test
    fun test7() {
        assertFalse(target.isValid("({([])))"))
    }

    @Test
    fun test8() {
        assertFalse(target.isValid("("))
    }

    @Test
    fun test9() {
        assertFalse(target.isValid("]"))
    }

    @Test
    fun test10() {
        assertFalse(target.isValid("(])"))
    }
}
