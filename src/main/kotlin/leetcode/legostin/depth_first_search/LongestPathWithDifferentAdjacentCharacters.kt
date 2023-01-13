package leetcode.legostin.depth_first_search

class LongestPathWithDifferentAdjacentCharacters {

    private var longestPath = 1

    fun longestPath(parent: IntArray, s: String): Int {
        val graph = hashMapOf<Int, ArrayList<Int>>()
        for (i in 1 until parent.size) {
            val j = parent[i]
            graph.putIfAbsent(j, ArrayList())
            graph[j]!!.add(i)
        }
        dfs(0, graph, s)
        return longestPath
    }

    private fun dfs(node: Int, graph: HashMap<Int, ArrayList<Int>>, s: String): Int {
        // if the node is a leaf
        if (!graph.containsKey(node)) return 1

        var max1 = 0
        var max2 = 0
        for (nbrNode in graph[node]!!) {
            val longestPathFromNbrNode  = dfs(nbrNode, graph, s)
            if (s[node] == s[nbrNode]) continue
            if (longestPathFromNbrNode > max1) {
                max2 = max1
                max1 = longestPathFromNbrNode
            } else if (longestPathFromNbrNode > max2) {
                max2 = longestPathFromNbrNode
            }
        }
        longestPath = Math.max(longestPath, max1 + max2 + 1)
        return max1 + 1
    }
}
