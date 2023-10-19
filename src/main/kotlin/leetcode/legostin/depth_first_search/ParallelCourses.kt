package leetcode.legostin.depth_first_search

class ParallelCourses {

    fun minimumTime(n: Int, relations: Array<IntArray>, time: IntArray): Int {
        val adj = mutableMapOf<Int, MutableList<Int>>()

        relations.forEach { (src, dst) ->
            val dstList = adj.getOrDefault(src, mutableListOf())
            dstList.add(dst)
            adj[src] = dstList
        }

        val maxTime = mutableMapOf<Int, Int>()

        for (i in 1 until n + 1) {
            dfs(i, adj, maxTime, time)
        }

        return maxTime.values.max()
    }

    private fun dfs(src: Int, adj: MutableMap<Int, MutableList<Int>>, maxTime: MutableMap<Int, Int>, time: IntArray): Int {
        maxTime[src]?.let { return it }

        var result = time[src - 1]
        val neighbors = adj.getOrDefault(src, emptyList())
        neighbors.forEach { neighbor ->
            result = Math.max(result, time[src - 1] + dfs(neighbor, adj, maxTime, time))
        }
        maxTime[src] = result
        return result
    }
}
