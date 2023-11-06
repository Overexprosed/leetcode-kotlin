package leetcode.legostin.heap

import java.util.PriorityQueue

class SeatManager(n: Int) {

    private val availableSeats = PriorityQueue<Int>(5)

    init {
        for (i in 1 until n + 1) {
            availableSeats.add(i)
        }
    }

    fun reserve(): Int {
        return availableSeats.poll()
    }

    fun unreserve(seatNumber: Int) {
        availableSeats.add(seatNumber)
    }
}
