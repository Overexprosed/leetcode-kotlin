package leetcode.legostin.hash_table

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContinuousSubarraySumTest {

    private val target = ContinuousSubarraySum()

    @Test
    fun test1() {
        target.checkSubarraySum(nums = intArrayOf(23, 2, 4, 6, 7), k = 6).let {
            assertThat(it).isTrue
        }
    }

    @Test
    fun test2() {
        target.checkSubarraySum(nums = intArrayOf(23, 2, 6, 4, 7), k = 6).let {
            assertThat(it).isTrue
        }
    }

    @Test
    fun test3() {
        target.checkSubarraySum(nums = intArrayOf(23, 2, 6, 4, 7), k = 13).let {
            assertThat(it).isFalse
        }
    }

    @Test
    fun test4() {
        target.checkSubarraySum(nums = intArrayOf(23, 2, 4, 6, 6), k = 7).let {
            assertThat(it).isTrue
        }
    }

    @Test
    fun test5() {
        target.checkSubarraySum(nums = intArrayOf(7, 1, 1), k = 7).let {
            assertThat(it).isFalse
        }
    }

    @Test
    fun test6() {
        target.checkSubarraySum(nums = intArrayOf(5, 0, 0, 0), k = 3).let {
            assertThat(it).isTrue
        }
    }

    @Test
    fun test7() {
        target.checkSubarraySum(nums = intArrayOf(23, 2, 4, 6, 6), k = 7).let {
            assertThat(it).isTrue
        }
    }
}
