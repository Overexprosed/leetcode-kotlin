package leetcode.legostin.tree

import leetcode.legostin.model.TreeNode

class BalanceBinarySearchTree {

    fun balanceBST(root: TreeNode?): TreeNode? {
        val inorder = mutableListOf<Int>()
        inorderTraversal(root, inorder)

        return constructBalancedBinarySearchTree(inorder, 0, inorder.size - 1)
    }

    private fun inorderTraversal(node: TreeNode?, inorder: MutableList<Int>) {
        node ?: return

        inorderTraversal(node.left, inorder)
        inorder.add(node.value)
        inorderTraversal(node.right, inorder)
    }

    private fun constructBalancedBinarySearchTree(inorder: MutableList<Int>, start: Int, end: Int): TreeNode? {
        if (start > end) return null

        val middle = start + (end - start) / 2

        val left = constructBalancedBinarySearchTree(inorder, start, middle - 1)
        val right = constructBalancedBinarySearchTree(inorder, middle + 1, end)

        return TreeNode(
            value = inorder[middle],
            left = left,
            right = right
        )
    }
}
