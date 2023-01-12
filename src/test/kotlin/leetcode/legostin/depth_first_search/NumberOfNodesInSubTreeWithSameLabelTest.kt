package leetcode.legostin.depth_first_search

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class NumberOfNodesInSubTreeWithSameLabelTest {

    private val target = NumberOfNodesInSubTreeWithSameLabel()

    @Test
    fun test1() {
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
            intArrayOf(2, 3),
            intArrayOf(2, 6)
        )
        val labels = "abaedcd"
        val expected = intArrayOf(2, 1, 1, 1, 1, 1, 1)
        val result = target.countSubTrees(7, edges, labels)
        assertArrayEquals(expected, result)
    }

    @Test
    fun test2() {
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 2),
            intArrayOf(0, 3)
        )
        val labels = "bbbb"
        val expected = intArrayOf(4, 2, 1, 1)
        val result = target.countSubTrees(4, edges, labels)
        assertArrayEquals(expected, result)
    }

    @Test
    fun test3() {
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 3),
            intArrayOf(0, 4)
        )
        val labels = "aabab"
        val expected = intArrayOf(3, 2, 1, 1, 1)
        val result = target.countSubTrees(5, edges, labels)
        assertArrayEquals(expected, result)
    }
}
