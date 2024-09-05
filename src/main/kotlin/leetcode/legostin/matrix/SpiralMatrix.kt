package leetcode.legostin.matrix

class SpiralMatrix {

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val result = mutableListOf<Int>()

        var rowBegin = 0
        var rowEnd = matrix.size - 1
        var colBegin = 0
        var colEnd = matrix[0].size - 1

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // left to right
            for (i in colBegin..colEnd) {
                result.add(matrix[rowBegin][i])
            }
            rowBegin++

            // top to bottom
            for (i in rowBegin..rowEnd) {
                result.add(matrix[i][colEnd])
            }
            colEnd--

            // right to left
            if (rowBegin <= rowEnd) { // Если матрица состоит из 1 ряда, достаточно пройтись с лево на право
                for (i in colEnd downTo colBegin) {
                    result.add(matrix[rowEnd][i])
                }
            }
            rowEnd--

            // bottom to top
            if (colBegin <= colEnd) { // Если матрица состоит из 1 ряда, достаточно пройтись сверху вниз
                for (i in rowEnd downTo rowBegin) {
                    result.add(matrix[i][colBegin])
                }
            }
            colBegin++
        }

        return result
    }
}
