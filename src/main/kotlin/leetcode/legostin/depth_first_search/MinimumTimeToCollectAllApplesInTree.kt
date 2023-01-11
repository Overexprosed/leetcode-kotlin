package leetcode.legostin.depth_first_search

class MinimumTimeToCollectAllApplesInTree {

    fun minTime(n: Int, edges: Array<IntArray>, hasApple: List<Boolean>): Int {
        val canVisit: Array<ArrayList<Int>?> = arrayOfNulls(n)

        // initialize
        for (i in 0 until n) {
            canVisit[i] = ArrayList(2)
        }

        for (edge in edges) {
            canVisit[edge[0]]!!.add(edge[1])
            canVisit[edge[1]]!!.add(edge[0])
        }
        val visited = BooleanArray(n)
        return helper(0, hasApple, canVisit, visited)
    }

    private fun helper(i: Int, hasApple: List<Boolean>, canVisit: Array<ArrayList<Int>?>, visited: BooleanArray): Int {
        if (visited[i]) return 0
        visited[i] = true

        var sum = 0
        for (edge in canVisit[i]!!) {
            sum += helper(edge, hasApple, canVisit, visited)
        }

        // case for root
        if (i == 0) return sum

        // any children contain an apple or the current node contains an apple
        return if (hasApple[i] || sum > 0) sum + 2 else 0
    }
}
