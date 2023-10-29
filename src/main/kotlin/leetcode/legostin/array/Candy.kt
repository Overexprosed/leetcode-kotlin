package leetcode.legostin.array

/**
 * Первый проход слева направо, сравниваем по левую руку.
 * Второй проход справа налево, сравниваем по правую руку.
 */
class Candy {

    fun candy(ratings: IntArray): Int {
        val result = IntArray(ratings.size) { 1 }
        if (ratings.size <= 1) {
            return result.size
        }

        for (i in 1 until ratings.size) {
            if (ratings[i] > ratings[i - 1]) {
                result[i] = result[i - 1] + 1
            }
        }
        for (i in ratings.size - 2 downTo 0) {
            if (ratings[i] > ratings[i + 1] && result[i] <= result[i + 1]) { // рейтинг больше, а конфет меньше же -> добавляем на 1 больше чем у низкорейтиногово
                result[i] = result[i + 1] + 1
            }
        }
        return result.sum()
    }
}
