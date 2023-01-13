package leetcode.legostin.depth_first_search

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestPathWithDifferentAdjacentCharactersTest {

    private val target = LongestPathWithDifferentAdjacentCharacters()

    @Test
    fun test1() {
        val parent = intArrayOf(-1, 0, 0, 1, 1, 2)
        val s = "abacbe"
        val result = target.longestPath(parent, s)
        assertEquals(3, result)
    }

    @Test
    fun test2() {
        val parent = intArrayOf(-1, 0, 0, 0)
        val s = "aabc"
        val result = target.longestPath(parent, s)
        assertEquals(3, result)
    }
}
