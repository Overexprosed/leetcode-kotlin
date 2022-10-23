package leetcode.legostin.medium

import leetcode.legostin.model.TreeNode
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidateBinarySearchTreeTest {

    private val target = ValidateBinarySearchTree()

    @Test
    fun test1() {
        val root = TreeNode(
            value = 2,
            left = TreeNode(1),
            right = TreeNode(3)
        )
        assertTrue(target.isValidBST(root))
    }

    @Test
    fun test2() {
        val root = TreeNode(
            // 1
            value = 5,
            // 2
            left = TreeNode(1),
            // 2
            right = TreeNode(
                value = 4,
                left = TreeNode(3),
                right = TreeNode(6)
            )
        )
        assertFalse(target.isValidBST(root))
    }
}
