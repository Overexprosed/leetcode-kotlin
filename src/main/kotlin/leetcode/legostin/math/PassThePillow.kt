package leetcode.legostin.math

class PassThePillow {

    fun passThePillow(n: Int, time: Int): Int {
        val fullRounds = time / (n - 1)
        val backDirection = fullRounds % 2 != 0

        val extraTime = time % (n - 1)

        return if (backDirection) {
            n - extraTime
        } else {
            extraTime + 1
        }
    }
}
