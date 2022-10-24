package leetcode.legostin.medium

import leetcode.legostin.model.TreeNode

/**
 * Given a binary search tree (BST),
 * find the lowest common ancestor (LCA) node of two given nodes in the BST.
 */
class LowestCommonAncestor {

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        var rootNode = root

        while (rootNode != null) {
            val rootValue = rootNode.value
            val pValue = p?.value ?: 0
            val qValue = q?.value ?: 0
            rootNode = if ((rootValue - pValue) > 0 && (rootValue - qValue) > 0) {
                rootNode.left
            } else if ((rootValue - pValue) < 0 && (rootValue - qValue) < 0) {
                rootNode.right
            } else {
                break
            }
        }
        return rootNode
    }
}
