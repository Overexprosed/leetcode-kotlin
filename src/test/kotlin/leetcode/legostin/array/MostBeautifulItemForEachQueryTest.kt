package leetcode.legostin.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MostBeautifulItemForEachQueryTest {

    private val target = MostBeautifulItemForEachQuery()

    @Test
    fun test1() {
        val items = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 2),
            intArrayOf(2, 4),
            intArrayOf(5, 6),
            intArrayOf(3, 5)
        )
        val queries = intArrayOf(1, 2, 3, 4, 5, 6)
        val expected = intArrayOf(2, 4, 5, 5, 6, 6)

        target.maximumBeauty(items, queries).also { assertArrayEquals(expected, it) }
    }

    @Test
    fun test2() {
        val items = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 4)
        )
        val queries = intArrayOf(1)
        val expected = intArrayOf(4)

        target.maximumBeauty(items, queries).also { assertArrayEquals(expected, it) }
    }

    @Test
    fun test3() {
        val items = arrayOf(
            intArrayOf(10, 1000)
        )
        val queries = intArrayOf(5)
        val expected = intArrayOf(0)

        target.maximumBeauty(items, queries).also { assertArrayEquals(expected, it) }
    }
}
