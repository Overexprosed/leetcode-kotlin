@file:Suppress("unused")

package leetcode.legostin.graph

class AllAncestorsOfNodeInDirectedAcyclicGraph {

    fun getAncestors(n: Int, edges: Array<IntArray>): List<List<Int>> {
        val adjacencyList: ArrayList<MutableList<Int>> = ArrayList(n)

        repeat(n) {
            adjacencyList.add(mutableListOf())
        }

        edges.forEach { edge ->
            val from = edge[0]
            val to = edge[1]
            adjacencyList[to].add(from)
        }

        val ancestorsList = ArrayList<List<Int>>()

        for (i in 0 until n) {
            val ancestors = mutableListOf<Int>()
            val visited = mutableSetOf<Int>()
            findChildren(i, visited, adjacencyList)

            for (node in 0 until n) {
                if (node == i) continue
                if (visited.contains(node)) ancestors.add(node)
            }

            ancestorsList.add(ancestors)
        }

        return ancestorsList
    }

    private fun findChildren(
        currentNode: Int,
        visited: MutableSet<Int>,
        adjacencyList: List<List<Int>>
    ) {
        visited.add(currentNode)

        adjacencyList[currentNode].forEach { neighbour ->
            if (!visited.contains(neighbour)) {
                findChildren(neighbour, visited, adjacencyList)
            }
        }
    }
}
