package leetcode.legostin.medium

import leetcode.legostin.model.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 */
class BinaryTreeLevelOrderTraversal {

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (root == null) {
            return result
        }
        val queue = LinkedList<TreeNode>()
        queue.offer(root)
        while (queue.isNotEmpty()) {
            val queueSize = queue.size
            val subList = mutableListOf<Int>()
            for (i in 0 until queueSize) {
                val node = queue.poll()
                subList.add(node.value)
                node.left?.let { leftNode ->
                    queue.offer(leftNode)
                }
                node.right?.let { rightNode ->
                    queue.offer(rightNode)
                }
            }
            result.add(subList)
        }
        return result
    }
}
