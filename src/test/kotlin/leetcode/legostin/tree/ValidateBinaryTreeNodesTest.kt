package leetcode.legostin.tree

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ValidateBinaryTreeNodesTest {

    private val target = ValidateBinaryTreeNodes()

    @Test
    fun test1() {
        val result = target.validateBinaryTreeNodes(
            n = 4,
            leftChild = intArrayOf(1, -1, 3, -1),
            rightChild = intArrayOf(2, -1, -1, -1)
        )
        assertThat(result).isTrue
    }

    @Test
    fun test2() {
        val result = target.validateBinaryTreeNodes(
            n = 4,
            leftChild = intArrayOf(1, -1, 3, -1),
            rightChild = intArrayOf(2, 3, -1, -1)
        )
        assertThat(result).isFalse
    }

    @Test
    fun test3() {
        val result = target.validateBinaryTreeNodes(
            n = 2,
            leftChild = intArrayOf(1, 0),
            rightChild = intArrayOf(-1, -1)
        )
        assertThat(result).isFalse
    }
}
