package leetcode.legostin.array

import java.util.*

class FindTheWinnerOfTheCircularGame {

    fun findTheWinner(n: Int, k: Int): Int {
        val players = LinkedList<Int>().apply { (1..n).forEach { add(it) } }

        var index = 0
        while (players.size > 1) {
            val remove = (index + k - 1) % players.size

            players.removeAt(remove)
            index = remove
        }

        return players.first()
    }
}
