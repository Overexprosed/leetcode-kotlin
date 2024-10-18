package leetcode.legostin.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MergeIntervalsTest {

    private val target = MergeIntervals()

    @Test
    fun test1() {
        val intervals = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 6)
        )
        val expected = arrayOf(intArrayOf(1, 6))
        val actual = target.merge(intervals)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        val intervals = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 6),
            intArrayOf(8, 10),
            intArrayOf(15, 18)
        )

        val expected = arrayOf(
            intArrayOf(1, 6),
            intArrayOf(8, 10),
            intArrayOf(15, 18)
        )
        val actual = target.merge(intervals)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        val intervals = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(4, 5)
        )
        val expected = arrayOf(intArrayOf(1, 5))
        val actual = target.merge(intervals)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun test4() {
        val intervals = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 6),
            intArrayOf(5, 7),
            intArrayOf(8, 10),
            intArrayOf(15, 18)
        )

        val expected = arrayOf(
            intArrayOf(1, 7),
            intArrayOf(8, 10),
            intArrayOf(15, 18)
        )
        val actual = target.merge(intervals)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun test5() {
        val intervals = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(0, 4)
        )
        val expected = arrayOf(intArrayOf(0, 4))
        val actual = target.merge(intervals)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun test6() {
        val intervals = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(0, 0)
        )
        val expected = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 4)
        )
        val actual = target.merge(intervals)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun test7() {
        val intervals = arrayOf(
            intArrayOf(2, 3),
            intArrayOf(4, 5),
            intArrayOf(6, 7),
            intArrayOf(8, 9),
            intArrayOf(1, 10),
        )
        val expected = arrayOf(
            intArrayOf(1, 10)
        )
        val actual = target.merge(intervals)

        assertArrayEquals(expected, actual)
    }
}
