package leetcode.legostin.matrix

class ValidSudoku {

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = mutableMapOf<Int, MutableSet<Char>>()
        val columns = mutableMapOf<Int, MutableSet<Char>>()
        val squares = mutableMapOf<Pair<Int, Int>, MutableSet<Char>>()

        // init
        for (i in 0 until 9) {
            rows[i] = mutableSetOf()
            columns[i] = mutableSetOf()
        }
        squares[0 to 0] = mutableSetOf()
        squares[0 to 1] = mutableSetOf()
        squares[0 to 2] = mutableSetOf()

        squares[1 to 0] = mutableSetOf()
        squares[1 to 1] = mutableSetOf()
        squares[1 to 2] = mutableSetOf()

        squares[2 to 0] = mutableSetOf()
        squares[2 to 1] = mutableSetOf()
        squares[2 to 2] = mutableSetOf()

        for (row in 0 until 9) {
            for (column in 0 until 9) {
                val current = board[row][column]

                val duplicateRow = rows[row]!!.contains(current)
                val duplicateColumn = columns[column]!!.contains(current)
                val duplicateInSquare = squares[(row / 3) to (column / 3)]!!.contains(current)

                if (current == '.') continue

                if (duplicateRow || duplicateColumn || duplicateInSquare) {
                    return false
                }

                rows[row]!!.add(current)
                columns[column]!!.add(current)
                squares[(row / 3) to (column / 3)]!!.add(current)
            }
        }

        return true
    }
}
