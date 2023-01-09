package leetcode.legostin.tree

import leetcode.legostin.model.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PreorderTraversalTest {

    private val target = PreorderTraversal()

    @Test
    fun test1() {
        val root = TreeNode(
            value = 1,
            right = TreeNode(
                value = 2,
                left = TreeNode(3)
            )
        )
        val result = target.preorderTraversal(root)
        assertEquals(result, listOf(1, 2, 3))
    }
}
