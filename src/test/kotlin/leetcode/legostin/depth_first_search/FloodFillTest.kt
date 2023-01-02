package leetcode.legostin.depth_first_search

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FloodFillTest {

    private val target = FloodFill()

    @Test
    fun test1() {
        val image = Array(3) { IntArray(3) } // 3x3
        // first row
        image[0][0] = 1
        image[0][1] = 1
        image[0][2] = 1
        // second row
        image[1][0] = 1
        image[1][1] = 1
        image[1][2] = 0
        // third row
        image[2][0] = 1
        image[2][1] = 0
        image[2][2] = 1
        // 1 1 1
        // 1 1 0
        // 1 0 1
        val result = target.floodFill(image, 1, 1, 2)
        // expected
        // 2 2 2
        // 2 2 0
        // 2 0 1
        val expected = Array(3) { IntArray(3) }
        // first row
        expected[0][0] = 2
        expected[0][1] = 2
        expected[0][2] = 2
        // second row
        expected[1][0] = 2
        expected[1][1] = 2
        expected[1][2] = 0
        // third row
        expected[2][0] = 2
        expected[2][1] = 0
        expected[2][2] = 1
        assertArrayEquals(expected, result)
    }
}
