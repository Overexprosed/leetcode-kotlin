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

            // [l, r] - windows, in which we search for the max jump
            for (i in l until r + 1) {
                // i - index, nums[i] - index; i + nums[i] - index we can jump to
                farthest = Math.max(farthest, i + nums[i])
            }
            l = r + 1
            r = farthest
            result++
        }

        return result
    }
}
