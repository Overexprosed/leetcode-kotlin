package leetcode.legostin.matrix

class ValidSudoku {

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = mutableMapOf<Int, MutableSet<Char>>()
        val columns = mutableMapOf<Int, MutableSet<Char>>()
        val squares = mutableMapOf<Pair<Int, Int>, MutableSet<Char>>()

        for (r in 0 until 9) {
            for (c in 0 until 9) {
                val current = board[r][c]
                if (current == '.') continue

                val row = rows.getOrPut(r) { mutableSetOf() }
                val column = columns.getOrPut(c) { mutableSetOf() }
                val square = squares.getOrPut((r / 3) to (c / 3)) { mutableSetOf() }

                if (current in row || current in column || current in square) {
                    return false
                }

                row.add(current)
                column.add(current)
                square.add(current)
            }
        }

        return true
    }
}
