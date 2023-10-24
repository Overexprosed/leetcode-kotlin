package leetcode.legostin.breadth_first_search

import leetcode.legostin.model.TreeNode
import java.util.*

class FindLargestValueInEachTreeRow {

    fun largestValues(root: TreeNode?): List<Int> {
        val result = ArrayList<Int>()

        if (root == null) {
            return result
        }

        val linkedList = LinkedList<TreeNode>()
        linkedList.offer(root)

        while (linkedList.isNotEmpty()) {
            val size = linkedList.size // фиксируем длину одного уровня
            var max = Integer.MIN_VALUE
            // Проходимся по одному уровню
            for (i in 0 until size) {
                val node = linkedList.poll()
                max = Math.max(max, node.value)

                node.left?.let { linkedList.offer(it) }
                node.right?.let { linkedList.offer(it) }
            }
            result.add(max)
        }
        return result
    }
}
