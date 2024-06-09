package leetcode.legostin.hash_table

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubarraySumsDivisibleByKTest {

    private val target = SubarraySumsDivisibleByK()

    @Test
    fun test1() {
        target.subarraysDivByK(nums = intArrayOf(4, 5, 0, -2, -3, 1), k = 5).let {
            assertThat(it).isEqualTo(7)
        }
    }

    @Test
    fun test2() {
        target.subarraysDivByK(nums = intArrayOf(5), k = 9).let {
            assertThat(it).isEqualTo(0)
        }
    }

    @Test
    fun test3() {
        target.subarraysDivByK(nums = intArrayOf(-1, 2, 9), k = 2).let {
            assertThat(it).isEqualTo(2)
        }
    }

    @Test
    fun test4() {
        target.subarraysDivByK(nums = intArrayOf(2, -2, 2, -4), k = 6).let {
            assertThat(it).isEqualTo(2)
        }
    }

    @Test
    fun test5() {
        target.subarraysDivByK(nums = intArrayOf(-1,-9,-4,0), k = 9).let {
            assertThat(it).isEqualTo(2)
        }
    }
}
