package leetcode.legostin.tree

import leetcode.legostin.model.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeTwoBinaryTreesTest {

    private val target = MergeTwoBinaryTrees()

    @Test
    fun test1() {
        //     1
        //    / \
        //   3   2
        //  /
        // 5
        val root1 = TreeNode(
            value = 1,
            left = TreeNode(
                value = 3,
                left = TreeNode(5)
            ),
            right = TreeNode(2)
        )
        //   2
        //  / \
        // 1   3
        //  \   \
        //   4   7
        val root2 = TreeNode(
            value = 2,
            left = TreeNode(
                value = 1,
                right = TreeNode(4)
            ),
            right = TreeNode(
                value = 3,
                right = TreeNode(7)
            )
        )
        val result = target.mergeTrees(root1, root2)
        //     3
        //    / \
        //   4   5
        //  / \   \
        // 5   4   7
        val expected = TreeNode(
            value = 3,
            left = TreeNode(
                value = 4,
                left = TreeNode(5),
                right = TreeNode(4)
            ),
            right = TreeNode(
                value = 5,
                right = TreeNode(7)
            )
        )
        assertEquals(expected, result)
    }
}
