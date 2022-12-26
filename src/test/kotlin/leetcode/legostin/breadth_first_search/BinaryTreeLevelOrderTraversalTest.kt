package leetcode.legostin.breadth_first_search

import leetcode.legostin.model.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreeLevelOrderTraversalTest {

    private val target = BinaryTreeLevelOrderTraversal()

    @Test
    fun test1() {
        val node = TreeNode(
            // level 1
            value = 3,
            // level 2
            left = TreeNode(9),
            right = TreeNode(
                // level 2
                value = 20,
                // level 3
                left = TreeNode(15),
                // level 3
                right = TreeNode(7)
            )
        )
        // [[3],[9,20],[15,7]]
        val expected = listOf(
            listOf(3),
            listOf(9, 20),
            listOf(15, 7)
        )
        assertEquals(expected, target.levelOrder(node))
    }
}
