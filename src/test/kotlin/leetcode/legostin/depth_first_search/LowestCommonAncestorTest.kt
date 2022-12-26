package leetcode.legostin.depth_first_search

import leetcode.legostin.model.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LowestCommonAncestorTest {

    private val target = LowestCommonAncestor()

    @Test
    fun test1() {
        /**
         *           (3)
         *          /  \
         *         /    \
         *        /      \
         *       /        \
         *     (5)        (1)
         *     / \        / \
         *  (6)  (2)   (0)  (8)
         *       / \
         *     (7)  (4)
         */
        val node = TreeNode(
            value = 3,
            left = TreeNode(
                value = 5,
                left = TreeNode(6),
                right = TreeNode(
                    value = 2,
                    left = TreeNode(7),
                    right = TreeNode(4)
                )
            ),
            right = TreeNode(
                value = 1,
                left = TreeNode(0),
                right = TreeNode(8)
            )
        )
        val result = target.lowestCommonAncestor(node, TreeNode(5), TreeNode(4))
        assertEquals(4, result!!.value)
    }

    @Test
    fun test2() {
        val node = TreeNode(
            value = 1,
            left = TreeNode(2),
            right = TreeNode(3)
        )
        val result = target.lowestCommonAncestor(node, TreeNode(2), TreeNode(3))
        assertEquals(1, result!!.value)
    }

    @Test
    fun test3() {
        /**
         *           (3)
         *          /
         *         /
         *        /
         *       /
         *     (5)
         *       \
         *       (2)
         */
        val node = TreeNode(
            value = 3,
            left = TreeNode(
                value = 5,
                left = null,
                right = TreeNode(2)
            ),
            right = null
        )
        val result = target.lowestCommonAncestor(node, TreeNode(5), TreeNode(2))
        assertEquals(2, result!!.value)
    }
}
