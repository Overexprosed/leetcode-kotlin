package leetcode.legostin.fibonacci

/**
 * Climbing Stairs
 *
 * You are climbing a staircase.
 * It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 *
 * ---
 * Basically, it's fibonacci
 */
class ClimbingStairs {

    fun climbStairs(n: Int): Int {
        if (n <= 2) return n

        var twoStepBefore = 1
        var oneStepBefore = 2
        var totalStep = 0
        for (i in 3..n) {
            totalStep = oneStepBefore + twoStepBefore
            twoStepBefore = oneStepBefore
            oneStepBefore = totalStep
        }
        return totalStep
    }
}
