package leetcode.legostin.depth_first_search

class NumberOfNodesInSubTreeWithSameLabel {

    private lateinit var result: IntArray
    private lateinit var chars: CharArray

    fun countSubTrees(n: Int, edges: Array<IntArray>, labels: String): IntArray {
        result = IntArray(n)
        chars = labels.toCharArray()
        val canVisit: Array<ArrayList<Int>?> = arrayOfNulls(n)

        for (i in 0 until n) {
            canVisit[i] = ArrayList(2)
        }

        for (edge in edges) {
            canVisit[edge[0]]!!.add(edge[1])
            canVisit[edge[1]]!!.add(edge[0])
        }
        dfs(-1, 0, canVisit)
        return result
    }

    private fun dfs(prev: Int, curr: Int, canVisit: Array<ArrayList<Int>?>): IntArray {
        val occurrences = IntArray(28)
        for (edge in canVisit[curr]!!) {
            if (edge != prev) {
                val childResult = dfs(curr, edge, canVisit)
                for (i in childResult.indices) {
                    occurrences[i] += childResult[i]
                }
            }
        }
        val count = occurrences[chars[curr].code - 'a'.code] + 1
        result[curr] = count
        occurrences[chars[curr].code - 'a'.code] = count
        return occurrences
    }
}
