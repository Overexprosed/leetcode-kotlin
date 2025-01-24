package leetcode.legostin.tree

import leetcode.legostin.model.TreeNode
import java.util.Stack

@Suppress("unused")
class InvertBinaryTree {

    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }

        val stack = Stack<TreeNode>()
        stack.add(root)

        while (stack.isNotEmpty()) {
            val node = stack.pop()

            val left = node.left
            node.left = node.right
            node.right = left

            if (node.left != null) {
                stack.add(node.left)
            }

            if (node.right != null) {
                stack.add(node.right)
            }
        }

        return root
    }
}
