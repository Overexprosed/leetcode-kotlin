package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RelativeSortArrayTest {

    private val target = RelativeSortArray()

    @Test
    fun test1() {
        target.relativeSortArray(
            arr1 = intArrayOf(2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19),
            arr2 = intArrayOf(2, 1, 4, 3, 9, 6)
        ).let {
            assertThat(it).isEqualTo(intArrayOf(2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19))
        }
    }

    @Test
    fun test2() {
        target.relativeSortArray(
            arr1 = intArrayOf(28, 6, 22, 8, 44, 17),
            arr2 = intArrayOf(22, 28, 8, 6)
        ).let {
            assertThat(it).isEqualTo(intArrayOf(22, 28, 8, 6, 17, 44))
        }
    }

    @Test
    fun test3() {
        target.relativeSortArray(
            arr1 = intArrayOf(33, 22, 48, 4, 39, 36, 41, 47, 15, 45),
            arr2 = intArrayOf(22, 33, 48, 4)
        ).let {
            assertThat(it).isEqualTo(intArrayOf(22, 33, 48, 4, 15, 36, 39, 41, 45, 47))
        }
    }
}
