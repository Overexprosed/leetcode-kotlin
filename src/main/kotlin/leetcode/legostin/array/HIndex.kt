package leetcode.legostin.array

/**
 * Дан массив, это кол-во страниц, на каждой странице сколько-то цитат.
 *  H индекс - это максимально N, которое повторяется на N страницах.
 */
class HIndex {

    fun hIndex(citations: IntArray): Int {
        citations.sort()

        for (i in citations.indices) {
            if (citations[i] >= citations.size - i) return citations.size - i
        }
        return 0
    }
}
