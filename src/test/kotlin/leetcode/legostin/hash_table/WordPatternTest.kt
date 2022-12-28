package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class WordPatternTest {

    private val target = WordPattern()

    @Test
    fun test1() {
        val result = target.wordPattern("abba", "cat dog dog cat")
        assertTrue(result)
    }

    @Test
    fun test2() {
        val result = target.wordPattern("abba", "cat dog dog fish")
        assertFalse(result)
    }

    @Test
    fun test3() {
        val result = target.wordPattern("abba", "dog dog dog dog")
        assertFalse(result)
    }

    @Test
    fun test4() {
        val result = target.wordPattern("aba", "dog cat cat")
        assertFalse(result)
    }
}
