package leetcode.legostin.dynamic_programming

class IntegerBreak {

    fun integerBreak(n: Int): Int {
        val dp = mutableMapOf(1 to 1)

        for (num in 2 until n + 1) {
            dp[num] = if (num == n) 0 else num

            for (i in 1 until num) {
                val innerResult = dp[i]!! * dp[num - i]!!
                dp[num] = innerResult.coerceAtLeast(dp[num]!!)
            }
        }
        return dp[n]!!
    }
}
