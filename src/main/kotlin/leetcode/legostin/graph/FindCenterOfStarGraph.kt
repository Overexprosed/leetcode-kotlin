package leetcode.legostin.graph

class FindCenterOfStarGraph {

    fun findCenter(edges: Array<IntArray>): Int {
        val nodeConnection = mutableMapOf<Int, Int>()

        edges.forEach { edge ->
            nodeConnection[edge[0]] = nodeConnection.getOrDefault(edge[0], 0) + 1
            nodeConnection[edge[1]] = nodeConnection.getOrDefault(edge[1], 0) + 1
        }

        return nodeConnection.filterValues { it == edges.size }.keys.firstOrNull() ?: -1
    }
}
