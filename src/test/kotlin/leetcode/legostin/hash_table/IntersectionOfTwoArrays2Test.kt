package leetcode.legostin.hash_table

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntersectionOfTwoArrays2Test {

    private val target = IntersectionOfTwoArrays2()

    @Test
    fun test1() {
        target.intersect(
            nums1 = intArrayOf(1, 2, 2, 1),
            nums2 = intArrayOf(2, 2)
        ).let {
            it.toList().let { result ->
                assertThat(result.size).isEqualTo(2)

                assertThat(result[0]).isEqualTo(2)
                assertThat(result[1]).isEqualTo(2)
            }
        }
    }

    @Test
    fun test2() {
        target.intersect(
            nums1 = intArrayOf(4, 9, 5),
            nums2 = intArrayOf(9, 4, 9, 8, 4)
        ).let {
            it.toList().let { result ->
                assertThat(result.size).isEqualTo(2)

                result.firstOrNull { num -> num == 4 }!!
                result.firstOrNull { num -> num == 9 }!!
            }
        }
    }
}
