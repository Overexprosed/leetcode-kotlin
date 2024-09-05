package leetcode.legostin.matrix

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SpiralMatrixTest {

    private val target = SpiralMatrix()

    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        val expected = listOf(1, 2, 3, 6, 9, 8, 7, 4, 5)

        target.spiralOrder(matrix).let { assertThat(it).isEqualTo(expected) }
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12)
        )
        val expected = listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)

        target.spiralOrder(matrix).let { assertThat(it).isEqualTo(expected) }
    }

    @Test
    fun test3() {
        val matrix = arrayOf(
            intArrayOf(7),
            intArrayOf(9),
            intArrayOf(6)
        )
        val expected = listOf(7, 9, 6)

        target.spiralOrder(matrix).let { assertThat(it).isEqualTo(expected) }
    }

    @Test
    fun test4() {
        val matrix = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        )
        val expected = listOf(1, 2, 4, 3)

        target.spiralOrder(matrix).let { assertThat(it).isEqualTo(expected) }
    }

    @Test
    fun test5() {
        val matrix = arrayOf(
            intArrayOf(2, 5, 8),
            intArrayOf(4, 0, -1)
        )
        val expected = listOf(2, 5, 8, -1, 0, 4)

        target.spiralOrder(matrix).let { assertThat(it).isEqualTo(expected) }
    }

    @Test
    fun test6() {
        val matrix = arrayOf(
            intArrayOf(1)
        )
        val expected = listOf(1)

        target.spiralOrder(matrix).let { assertThat(it).isEqualTo(expected) }
    }
}
