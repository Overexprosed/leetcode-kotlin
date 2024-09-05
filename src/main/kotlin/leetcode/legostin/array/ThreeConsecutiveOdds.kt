package leetcode.legostin.array

class ThreeConsecutiveOdds {

    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var count = 0

        arr.forEach { num ->
            if (num % 2 != 0) {
                count++
            } else {
                count = 0
            }

            if (count == 3) {
                return true
            }
        }

        return false
    }
}
