package leetcode.legostin.number

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MajorityElementTest {

    private val target = MajorityElement()

    @Test
    fun test1() {
        val array1 = intArrayOf(3, 2, 3)
        assertEquals(3, target.majorityElement(array1))
    }

    @Test
    fun test2() {
        val array1 = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        assertEquals(2, target.majorityElement(array1))
    }

    @Test
    fun test3() {
        val array1 = intArrayOf(1, 2)
        assertEquals(-1, target.majorityElement(array1))
    }

    @Test
    fun test4() {
        val array1 = intArrayOf()
        assertEquals(-1, target.majorityElement(array1))
    }

    @Test
    fun test5() {
        val array1 = intArrayOf(2, 3, 2, 3)
        assertEquals(-1, target.majorityElement(array1))
    }

    @Test
    fun test6() {
        val array1 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertEquals(-1, target.majorityElement(array1))
    }

    @Test
    fun test7() {
        val array1 = intArrayOf(1, 1, 1, 1, 3, 6, 7, 8, 9, 2)
        assertEquals(-1, target.majorityElement(array1))
    }

    @Test
    fun test8() {
        val array1 = intArrayOf(1, 1, 1, 1, 1, 6, 7, 8, 9, 2)
        assertEquals(-1, target.majorityElement(array1))
    }

    @Test
    fun test9() {
        val array1 = intArrayOf(3, 3, 1)
        assertEquals(3, target.majorityElement(array1))
    }
}
