package leetcode.legostin.tree

import leetcode.legostin.model.TreeNode
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SameTreeTest {

    private val target = SameTree()

    @Test
    fun test1() {
        val result = target.isSameTree(null, null)
        assertTrue(result)
    }

    @Test
    fun test2() {
        val node1 = TreeNode(1, null, null)
        val node2 = TreeNode(1, null, null)
        val result = target.isSameTree(node1, node2)
        assertTrue(result)
    }

    @Test
    fun test3() {
        val node1 = TreeNode(
            1,
            TreeNode(2, null, null),
            null
        )
        val node2 = TreeNode(
            1,
            TreeNode(2, null, null),
            null
        )
        val result = target.isSameTree(node1, node2)
        assertTrue(result)
    }

    @Test
    fun test4() {
        val node1 = TreeNode(
            1,
            TreeNode(2, null, null),
            TreeNode(3, null, null)
        )
        val node2 = TreeNode(
            1,
            TreeNode(2, null, null),
            TreeNode(3, null, null)
        )
        val result = target.isSameTree(node1, node2)
        assertTrue(result)
    }

    @Test
    fun test5() {
        val node1 = TreeNode(
            1,
            TreeNode(2, null, null),
            TreeNode(
                3,
                TreeNode(4, null, null),
                null
            )
        )
        val node2 = TreeNode(
            1,
            TreeNode(2, null, null),
            TreeNode(
                3,
                TreeNode(4, null, null),
                null
            )
        )
        val result = target.isSameTree(node1, node2)
        assertTrue(result)
    }

    @Test
    fun test6() {
        val node1 = TreeNode(1, null, null)
        val node2 = TreeNode(2, null, null)
        val result = target.isSameTree(node1, node2)
        assertFalse(result)
    }

    @Test
    fun test7() {
        val node1 = TreeNode(
            1,
            TreeNode(2, null, null),
            TreeNode(
                3,
                TreeNode(4, null, null),
                null
            )
        )
        val node2 = TreeNode(
            1,
            TreeNode(2, null, null),
            TreeNode(
                3,
                TreeNode(5, null, null),
                null
            )
        )
        val result = target.isSameTree(node1, node2)
        assertFalse(result)
    }

    @Test
    fun test8() {
        val node1 = TreeNode(
            1,
            TreeNode(1, null, null),
            null
        )
        val node2 = TreeNode(
            1,
            null,
            TreeNode(1, null, null)
        )
        val result = target.isSameTree(node1, node2)
        assertFalse(result)
    }
}
