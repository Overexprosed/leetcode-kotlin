package leetcode.legostin.tree

import leetcode.legostin.model.TreeNode
import java.util.LinkedList

class MaximumDepthOfBinaryTree {

    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        val queue = LinkedList<TreeNode>()
        queue.offer(root)
        var count = 0

        while (queue.isNotEmpty()) {
            var size = queue.size

            while (size-- > 0) {
                val node = queue.poll()

                if (node.right != null) {
                    queue.offer(node.right)
                }

                if (node.left != null) {
                    queue.offer(node.left)
                }
            }

            count++
        }

        return count
    }
}
