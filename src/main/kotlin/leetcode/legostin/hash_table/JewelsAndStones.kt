package leetcode.legostin.hash_table

class JewelsAndStones {

    fun numJewelsInStones(jewels: String, stones: String): Int {
        val set = jewels.toSet()

        var count = 0
        for (c in stones.toCharArray()) {
            if (set.contains(c)) {
                count++
            }
        }
        return count
    }
}
