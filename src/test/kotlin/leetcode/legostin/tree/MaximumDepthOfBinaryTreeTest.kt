package leetcode.legostin.tree

import leetcode.legostin.model.TreeNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaximumDepthOfBinaryTreeTest {

    private val target = MaximumDepthOfBinaryTree()

    @Test
    fun test1() {
        //region Инициализация дерева
        val root = TreeNode(3)

        val left1 = TreeNode(9)
        val right1 = TreeNode(20)

        root.left = left1
        root.right = right1

        val left2 = TreeNode(15)
        val right2 = TreeNode(7)

        right1.left = left2
        right1.right = right2
        //endregion

        target.maxDepth(root).also { assertThat(it).isEqualTo(3) }
    }

    @Test
    fun test2() {
        //region Инициализация дерева
        val root = TreeNode(1)
        root.right = TreeNode(2)
        //endregion

        target.maxDepth(root).also { assertThat(it).isEqualTo(2) }
    }
}
