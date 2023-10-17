package leetcode.legostin.tree

import java.util.*

class ValidateBinaryTreeNodes {

    /**
     * Не валидно если:
     *   1. Есть цикл
     *   2. Из одной ветки дерева нельзя перейти в другую (в решении это проверяется наличием дубликатов)
     */
    fun validateBinaryTreeNodes(n: Int, leftChild: IntArray, rightChild: IntArray): Boolean {
        val queue = ArrayDeque<Int>()
        val visited = HashSet<Int>()

        val root = findRoot(n, leftChild, rightChild)
        if (root == -1) return false
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val node = queue.poll()

            if (node == -1) continue
            if (!visited.add(node)) return false

            queue.offer(leftChild[node])
            queue.offer(rightChild[node])
        }

        return visited.size == n
    }

    private fun findRoot(n: Int, leftChild: IntArray, rightChild: IntArray): Int {
        val hashSet = HashSet<Int>()

        for (i in 0 until n) {
            hashSet.add(i)
        }

        leftChild.forEach { hashSet.remove(it) }
        rightChild.forEach { hashSet.remove(it) }

        return if (hashSet.size == 1) hashSet.first() else - 1
    }
}
