package leetcode.legostin.depth_first_search

import leetcode.legostin.model.Node
import java.util.Stack

/**
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 *
 * Nary-Tree input serialization is represented in their level order traversal.
 * Each group of children is separated by the null value (See examples)
 */
class NAryTreePreorderTraversal {

    fun preorder(root: Node?): List<Int> {
        val result = mutableListOf<Int>()
        if (root == null) {
            return result
        }
        val stack = Stack<Node>()
        stack.push(root)
        while (stack.isNotEmpty()) {
            val node = stack.pop()
            result.add(node.value)
            for (i in node.children.size - 1 downTo 0) {
                stack.push(node.children[i])
            }
        }
        return result
    }
}
