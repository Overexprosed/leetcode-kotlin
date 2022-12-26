package leetcode.legostin.depth_first_search

import leetcode.legostin.model.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 *
 * A valid BST is defined as follows:
 *  1. The left subtree of a node contains only nodes with keys less than the node's key.
 *  2. The right subtree of a node contains only nodes with keys greater than the node's key.
 *  3. Both the left and right subtrees must also be binary search trees.
 */
class ValidateBinarySearchTree {

    fun isValidBST(root: TreeNode?): Boolean {
        if (root == null) {
            return false
        }
        var rootNode = root
        var prev: TreeNode? = null
        val stack = Stack<TreeNode>()
        while (rootNode != null || stack.isNotEmpty()) {
            while (rootNode != null) {
                stack.push(rootNode)
                rootNode = rootNode.left
            }
            rootNode = stack.pop()
            // prev is left, left in valid BST is smallest
            // that is current (root or right) is less -> BST is invalid
            if (prev != null && rootNode!!.value <= prev.value) {
                return false
            }
            prev = rootNode
            rootNode = rootNode!!.right
        }
        return true
    }
}
