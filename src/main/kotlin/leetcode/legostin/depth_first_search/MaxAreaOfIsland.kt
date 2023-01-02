package leetcode.legostin.depth_first_search

class MaxAreaOfIsland {

    private var answer = 0
    private lateinit var seen: Array<BooleanArray>
    private lateinit var grid: Array<IntArray>

    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        this.grid = grid
        seen = Array(grid.size) { BooleanArray(grid[0].size) }
        for (r in grid.indices) {
            for (c in grid[r].indices) {
                answer = answer.coerceAtLeast(area(r, c))
            }
        }
        return answer
    }

    private fun area(r: Int, c: Int): Int {
        if (
            r < 0 ||
            r >= grid.size ||
            c < 0 ||
            c >= grid[0].size ||
            // already seen
            seen[r][c] ||
            // cell is land
            grid[r][c] == 0
        ) {
            return 0
        }
        seen[r][c] = true
        // 4-directionally traversal
        return 1 + area(r - 1, c) + area(r + 1, c) + area(r, c - 1) + area(r, c + 1)
    }
}
