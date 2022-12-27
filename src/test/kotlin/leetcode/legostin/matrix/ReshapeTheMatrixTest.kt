package leetcode.legostin.matrix

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReshapeTheMatrixTest {

    private val target = ReshapeTheMatrix()

    @Test
    fun test1() {
        val matrix = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val output = target.matrixReshape(matrix, 1, 4)
        val row1 = output[0]
        assertEquals(4, row1.size)
        assertEquals(1, row1[0])
        assertEquals(2, row1[1])
        assertEquals(3, row1[2])
        assertEquals(4, row1[3])
    }

    @Test
    fun test2() {
        val matrix = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val output = target.matrixReshape(matrix, 1, 3)

        // matrix stays the same
        val row1 = output[0]
        val row2 = output[1]
        assertEquals(2, row1.size)
        assertEquals(1, row1[0])
        assertEquals(2, row1[1])
        assertEquals(3, row2[0])
        assertEquals(4, row2[1])
    }

    @Test
    fun test3() {
        val matrix = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val output = target.matrixReshape(matrix, 2, 2)

        // matrix stays the same
        val row1 = output[0]
        val row2 = output[1]
        assertEquals(2, row1.size)
        assertEquals(1, row1[0])
        assertEquals(2, row1[1])
        assertEquals(3, row2[0])
        assertEquals(4, row2[1])
    }
}
