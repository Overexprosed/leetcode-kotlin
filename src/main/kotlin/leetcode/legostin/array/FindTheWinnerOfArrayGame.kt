package leetcode.legostin.array

/**
 * Если за 1 проход не нашелся победитель, берем максимальный элемент массива,
 * потому что ни кто его больше не победит.
 */
class FindTheWinnerOfArrayGame {

    fun getWinner(arr: IntArray, k: Int): Int {
        var current = arr[0]
        var round = 0

        for (i in 1 until arr.size) {
            if (arr[i] > current) {
                current = arr[i]
                round = 0
            }
            if (++round == k) break
        }
        return if (round == k) current else arr.max()
    }
}
