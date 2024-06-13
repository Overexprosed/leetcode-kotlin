package leetcode.legostin.array

import kotlin.math.abs

class MinimumNumberOfMovesToSeatEveryone {

    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        var moves = 0

        seats.sort()
        students.sort()

        for (i in seats.indices) {
            moves += abs(seats[i] - students[i])
        }

        return moves
    }
}
