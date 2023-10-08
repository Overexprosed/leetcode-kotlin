package leetcode.legostin.dynamic_programming

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaxDotProductOfTwoSubsequencesTest {

    private val target = MaxDotProductOfTwoSubsequences()

    @Test
    fun test1() {
        val result = target.maxDotProduct(
            nums1 = intArrayOf(2, 1, -2, 5),
            nums2 = intArrayOf(3, 0, -6)
        )
        assertThat(result).isEqualTo(18)
    }

    @Test
    fun test2() {
        val result = target.maxDotProduct(
            nums1 = intArrayOf(3, -2),
            nums2 = intArrayOf(2, -6, 7)
        )
        assertThat(result).isEqualTo(21)
    }

    @Test
    fun test3() {
        val result = target.maxDotProduct(
            nums1 = intArrayOf(-1, -1),
            nums2 = intArrayOf(1, 1)
        )
        assertThat(result).isEqualTo(-1)
    }
}
