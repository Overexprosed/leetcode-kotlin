package leetcode.legostin.depth_first_search

import leetcode.legostin.model.TreeNode

class CountNodesEqualToAverageOfSubtree {

    private var result = 0

    fun averageOfSubtree(root: TreeNode?): Int {
        dfs(root)
        return result
    }

    private fun dfs(root: TreeNode?): IntArray {
        root ?: return IntArray(2) { 0 }

        val left = dfs(root.left)
        val right = dfs(root.right)

        val currentSum = left[0] + right[0] + root.value
        val currentCount = left[1] + right[1] + 1

        if (currentSum / currentCount == root.value) {
            result++
        }
        return intArrayOf(currentSum, currentCount)
    }
}
