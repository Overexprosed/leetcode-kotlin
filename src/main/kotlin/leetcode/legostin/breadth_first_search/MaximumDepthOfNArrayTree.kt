package leetcode.legostin.breadth_first_search

import leetcode.legostin.model.Node
import java.util.LinkedList

/**
 * Given n-ary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
class MaximumDepthOfNArrayTree {

    fun maxDepth(root: Node?): Int {
        if (root == null) return 0

        var depth = 0
        val queue = LinkedList<Node>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            depth++
            val size = queue.size - 1
            for (i in size downTo 0) {
                val node = queue.poll()
                if (node.children.isNotEmpty()) {
                    for (children in node.children) {
                        queue.offer(children)
                    }
                }
            }
        }
        return depth
    }
}
