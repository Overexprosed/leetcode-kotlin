package leetcode.legostin.matrix

/**
 * In MATLAB, there is a handy function called reshape,
 * which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
 *
 * You are given an m x n matrix mat and two integers r and c representing the number of rows
 * and the number of columns of the wanted reshaped matrix.
 *
 * The reshaped matrix should be filled with all the elements of the original matrix
 * in the same row-traversing order as they were.
 *
 * If the reshape operation with given parameters is possible and legal,
 * output the new reshaped matrix; Otherwise, output the original matrix.
 */
class ReshapeTheMatrix {

    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (mat.isNotEmpty() && (r * c != mat.size * mat[0].size)) {
            return mat
        }
        val result = Array(r) { IntArray(c) }

        var newRow = 0
        var newColumn = 0
        for (i in mat.indices) {
            val row = mat[i]
            for (j in row.indices) {
                result[newRow][newColumn++] = row[j]
                if (newColumn == c) {
                    newRow++
                    newColumn = 0
                }
            }
        }
        return result
    }
}
