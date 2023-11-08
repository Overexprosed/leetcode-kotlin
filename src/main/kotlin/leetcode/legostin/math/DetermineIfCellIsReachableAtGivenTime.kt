package leetcode.legostin.math

class DetermineIfCellIsReachableAtGivenTime {

    fun isReachableAtTime(sx: Int, sy: Int, fx: Int, fy: Int, t: Int): Boolean {
        val need = Math.max(Math.abs(sx - fx), Math.abs(sy - fy))
        return if (need > 0) t >= need else t != 1
    }
}
