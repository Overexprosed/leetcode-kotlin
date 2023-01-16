package leetcode.legostin.model

class UnionFind(
    val size: Int
) {

    private var parent = IntArray(size)
    private var rank = IntArray(size)

    init {
        for (i in 0 until size) {
            parent[i] = i
        }
    }

    fun find(x: Int): Int {
        if (parent[x] != x) {
            parent[x] = find(parent[x])
        }
        return parent[x]
    }

    fun union(x: Int, y: Int) {
        val xSet = find(x)
        val ySet = find(y)
        if (xSet == ySet) {
            return
        } else if (rank[xSet] < rank[ySet]) {
            parent[xSet] = ySet
        } else if (rank[xSet] > rank[ySet]) {
            parent[ySet] = xSet
        } else {
            parent[ySet] = xSet
            rank[xSet]++
        }
    }
}
