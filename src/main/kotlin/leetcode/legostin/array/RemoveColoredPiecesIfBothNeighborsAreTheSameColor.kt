package leetcode.legostin.array

class RemoveColoredPiecesIfBothNeighborsAreTheSameColor {

    fun winnerOfGame(colors: String): Boolean {
        var alice = 0
        var bob = 0

        for (i in 1 until colors.length - 1) {
            if (colors.elementAt(i - 1) == colors.elementAt(i) && colors.elementAt(i) == colors.elementAt(i + 1)) {
                if (colors.elementAt(i) == 'A') {
                    alice++
                } else {
                    bob++
                }
            }
        }
        return alice > bob // Если равны, Боб выигрывает, т.к. Алиса ходит первой, а тот кто не может сделать ход проигрывает
    }
}
