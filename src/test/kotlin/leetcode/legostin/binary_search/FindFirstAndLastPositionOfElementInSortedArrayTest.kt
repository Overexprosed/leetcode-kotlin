package leetcode.legostin.binary_search

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FindFirstAndLastPositionOfElementInSortedArrayTest {

    private val target = FindFirstAndLastPositionOfElementInSortedArray()

    @Test
    fun test1() {
        val result = target.searchRange(nums = intArrayOf(5, 7, 7, 8, 8, 10), target = 8)

        assertThat(result.size).isEqualTo(2)
        assertThat(result[0]).isEqualTo(3)
        assertThat(result[1]).isEqualTo(4)
    }

    @Test
    fun test2() {
        val result = target.searchRange(nums = intArrayOf(5, 7, 7, 8, 8, 10), target = 6)

        assertThat(result.size).isEqualTo(2)
        assertThat(result[0]).isEqualTo(-1)
        assertThat(result[1]).isEqualTo(-1)
    }

    @Test
    fun test3() {
        val result = target.searchRange(nums = intArrayOf(), target = 0)

        assertThat(result.size).isEqualTo(2)
        assertThat(result[0]).isEqualTo(-1)
        assertThat(result[1]).isEqualTo(-1)
    }
}
