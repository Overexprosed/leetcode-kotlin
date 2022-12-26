package leetcode.legostin.depth_first_search

import leetcode.legostin.model.TreeNode


/**
 * Given a binary search tree (BST),
 * find the lowest common ancestor (LCA) node of two given nodes in the BST.
 */
class LowestCommonAncestor {

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null || root == p || root == q) return root

        val left = lowestCommonAncestor(root.left, p, q)
        val right = lowestCommonAncestor(root.right, p, q)

        return if (left == null) right else if (right == null) left else root
    }
}
