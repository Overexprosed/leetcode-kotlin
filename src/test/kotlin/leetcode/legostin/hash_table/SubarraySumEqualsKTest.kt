package leetcode.legostin.hash_table

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubarraySumEqualsKTest {

    private val target = SubarraySumEqualsK()

    @Test
    fun test1() {
        target.subarraySum(nums = intArrayOf(1, 1, 1), k = 2).let {
            assertThat(it).isEqualTo(2)
        }
    }

    @Test
    fun test2() {
        target.subarraySum(nums = intArrayOf(1, 2, 3), k = 3).let {
            assertThat(it).isEqualTo(2)
        }
    }

    @Test
    fun test3() {
        target.subarraySum(nums = intArrayOf(3, 3), k = 3).let {
            assertThat(it).isEqualTo(2)
        }
    }

    @Test
    fun test4() {
        target.subarraySum(nums = intArrayOf(1, 1), k = 2).let {
            assertThat(it).isEqualTo(1)
        }
    }
}
