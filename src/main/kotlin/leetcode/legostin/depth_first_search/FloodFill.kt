package leetcode.legostin.depth_first_search

class FloodFill {

    /**
     * Flood fill.
     *
     * @param image matrix
     * @param sr source row
     * @param sc source column
     */
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        val color = image[sr][sc]
        if (color != newColor) dfs(image, sr, sc, color, newColor)
        return image
    }

    private fun dfs(image: Array<IntArray>, sr: Int, sc: Int, color: Int, newColor: Int): Array<IntArray> {
        if (image[sr][sc] == color) {
            image[sr][sc] = newColor
            if (sr >= 1) dfs(image, sr - 1, sc, color, newColor)
            if (sc >= 1) dfs(image, sr, sc - 1, color, newColor)
            if (sr + 1 < image.size) dfs(image, sr + 1, sc, color, newColor)
            if (sc + 1 < image[0].size) dfs(image, sr, sc + 1, color, newColor)
        }
        return image
    }
}
