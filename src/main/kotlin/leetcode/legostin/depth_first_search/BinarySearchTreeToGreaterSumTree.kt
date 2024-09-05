package leetcode.legostin.depth_first_search

import leetcode.legostin.model.TreeNode

class BinarySearchTreeToGreaterSumTree {

    private var sum = 0

    fun bstToGst(root: TreeNode?): TreeNode? {
        calculateSum(root)
        return root
    }

    private fun calculateSum(node: TreeNode?) {
        if (node == null) {
            return
        }
        calculateSum(node.right)
        sum += node.value
        node.value = sum
        calculateSum(node.left)
    }
}
