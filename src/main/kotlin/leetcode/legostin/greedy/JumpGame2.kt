package leetcode.legostin.greedy

/**
 * Оконная жадина.
 * Вводим окно и раздвигаем его каждый раз настолько насколько это максимально возможно,
 * каждое раздвижение это 1 шаг.
 */
class JumpGame2 {

    fun jump(nums: IntArray): Int {
        var result = 0
        var l = 0
        var r = 0

        while (r < nums.size - 1) {
            var farthest = 0
            for (i in l until r + 1) {
                farthest = Math.max(farthest, i + nums[i])
            }
            l = r + 1
            r = farthest
            result++
        }
        return result
    }
}
