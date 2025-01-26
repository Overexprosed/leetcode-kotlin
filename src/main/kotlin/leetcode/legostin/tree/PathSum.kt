package leetcode.legostin.tree

import leetcode.legostin.model.TreeNode

@Suppress("unused")
class PathSum {

    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false

        if (root.left == null && root.right == null && targetSum - root.value == 0) return true

        return hasPathSum(root.left, targetSum - root.value) || hasPathSum(root.right, targetSum - root.value)
    }
}
