package leetcode.legostin.number

class ArrangingCoins {

    fun arrangeCoins(n: Int): Int {
        var blocks = 0
        var coinsToBuilt = 1
        var coinsLeft = n

        while (coinsLeft > 0) {
            if (coinsLeft >= coinsToBuilt) {
                blocks++
                coinsLeft -= coinsToBuilt
                coinsToBuilt++
            } else {
                break
            }
        }
        return blocks
    }
}
