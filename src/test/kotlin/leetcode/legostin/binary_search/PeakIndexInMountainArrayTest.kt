package leetcode.legostin.binary_search

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PeakIndexInMountainArrayTest {

    private val target = PeakIndexInMountainArray()

    @Test
    fun test1() {
        val result = target.peakIndexInMountainArray(arr = intArrayOf(0, 1, 0))
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun test2() {
        val result = target.peakIndexInMountainArray(arr = intArrayOf(0, 2, 1, 0))
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun test3() {
        val result = target.peakIndexInMountainArray(arr = intArrayOf(0, 10, 5, 2))
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun test4() {
        val result = target.peakIndexInMountainArray(arr = intArrayOf(18, 29, 38, 59, 98, 100, 99, 98, 90))
        assertThat(result).isEqualTo(5)
    }
}
