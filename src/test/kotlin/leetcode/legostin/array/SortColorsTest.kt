package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SortColorsTest {

    private val target = SortColors()

    @Test
    fun test1() {
        val array = intArrayOf(2, 0, 2, 1, 1, 0)

        target.sortColors(array)

        assertThat(array).isEqualTo(intArrayOf(0, 0, 1, 1, 2, 2))
    }

    @Test
    fun test2() {
        val array = intArrayOf(2, 0, 1)

        target.sortColors(array)

        assertThat(array).isEqualTo(intArrayOf(0, 1, 2))
    }
}
