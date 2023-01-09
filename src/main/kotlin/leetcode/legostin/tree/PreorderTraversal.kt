package leetcode.legostin.tree

import leetcode.legostin.model.TreeNode

class PreorderTraversal {

    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        if (root == null) return result
        traverse(root, result)
        return result
    }

    private fun traverse(root: TreeNode?, result: MutableList<Int>) {
        if (root?.value != null) {
            result.add(root.value)
        }

        if (root?.left != null) {
            traverse(root.left, result)
        }
        if (root?.right != null) {
            traverse(root.right, result)
        }
    }
}
