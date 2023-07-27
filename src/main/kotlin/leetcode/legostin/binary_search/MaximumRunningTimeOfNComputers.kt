package leetcode.legostin.binary_search

/**
 * В первую очередь поймем сколько физически доступно минут для каждого компьютера из
 * данных батареек.
 *
 * Т.к. замена батарейки не занимаем времени, основная проблема в том, что на какой-то батарейке
 * меньше минут чем в других, поэтому не все компьютеры могут быть запущены одновременно.
 *
 * Бинарным поиском найдем максимально кол-во одновременно работающих компьютеров.
 * Максимальное кол-во одновременно работающих компьютеров может быть получено при использовании
 * всех батареек, поэтому нам нужно исходить из минимального объема каждой батарейки.
 */
class MaximumRunningTimeOfNComputers {

    fun maxRunTime(n: Int, batteries: IntArray): Long {
        val batteriesL = batteries.map { it.toLong() }

        var left = 1L
        // найдем кол-во минут доступное для каждого компьютера из всей доступной мощности батареек
        var right = batteriesL.sum() / n
        while (left < right) {
            val target = right - ((right - left) / 2)
            val total = batteriesL.sumOf { it.coerceAtMost(target) }
            if (target * n > total) {
                right = target - 1
            } else {
                left = target
            }
        }
        return left
    }
}
