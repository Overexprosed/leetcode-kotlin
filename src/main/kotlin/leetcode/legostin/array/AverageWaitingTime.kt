package leetcode.legostin.array

class AverageWaitingTime {

    fun averageWaitingTime(customers: Array<IntArray>): Double {
        var totalTimeSpend = 0L
        var currentTime = customers[0][0] // first order was taken

        customers.forEach { customer ->
            val arrivalTime = customer[0]
            val orderTimeCost = customer[1]

            if (currentTime < arrivalTime) {
                currentTime = arrivalTime
            }

            currentTime += orderTimeCost
            totalTimeSpend += currentTime - arrivalTime
        }

        return totalTimeSpend.toDouble() / customers.size
    }
}
