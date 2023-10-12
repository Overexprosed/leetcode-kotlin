package leetcode.legostin.binary_search

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FindInMountainArrayTest {

    private val target = FindInMountainArray()

    @Test
    fun test1() {
        val testMountainArray = TestMountainArray(array = intArrayOf(1, 2, 3, 4, 5, 3, 1))
        val result = target.findInMountainArray(target = 3, testMountainArray)
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun test2() {
        val testMountainArray = TestMountainArray(array = intArrayOf(0, 1, 2, 4, 2, 1))
        val result = target.findInMountainArray(target = 3, testMountainArray)
        assertThat(result).isEqualTo(-1)
    }

    @Test
    fun test3() {
        val testMountainArray = TestMountainArray(array = intArrayOf(1, 2, 3, 4, 5, 3, 1))
        val result = target.findInMountainArray(target = 2, testMountainArray)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun test4() {
        val testMountainArray = TestMountainArray(array = intArrayOf(1, 5, 2))
        val result = target.findInMountainArray(target = 2, testMountainArray)
        assertThat(result).isEqualTo(2)
    }

    class TestMountainArray(
        private val array: IntArray
    ) : FindInMountainArray.MountainArray {
        override fun get(index: Int): Int = array[index]
        override fun length(): Int = array.size
    }
}
