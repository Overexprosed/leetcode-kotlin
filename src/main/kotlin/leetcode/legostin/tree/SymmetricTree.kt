package leetcode.legostin.tree

import leetcode.legostin.model.TreeNode
import java.util.Stack

@Suppress("unused")
class SymmetricTree {

    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }

        val stack = Stack<TreeNode?>()
        stack.add(root.left)
        stack.add(root.right)

        while (stack.isNotEmpty()) {
            val left = stack.pop()
            val right = stack.pop()

            if (left == null && right == null) {
                continue
            }

            if (left == null || right == null || left.value != right.value) {
                return false
            }

            stack.add(left.left)
            stack.add(right.right)

            stack.add(left.right)
            stack.add(right.left)
        }

        return true
    }
}
