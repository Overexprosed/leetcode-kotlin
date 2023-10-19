package leetcode.legostin.depth_first_search

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ParallelCoursesTest {

    private val target = ParallelCourses()

    @Test
    fun test1() {
        val result = target.minimumTime(
            n = 3,
            relations = arrayOf(intArrayOf(1, 3), intArrayOf(2, 3)),
            time = intArrayOf(3, 2, 5)
        )
        assertThat(result).isEqualTo(8)
    }

    @Test
    fun test2() {
        val result = target.minimumTime(
            n = 5,
            relations = arrayOf(intArrayOf(1, 5), intArrayOf(2, 5), intArrayOf(3, 5), intArrayOf(3, 4), intArrayOf(4, 5)),
            time = intArrayOf(1, 2, 3, 4, 5)
        )
        assertThat(result).isEqualTo(12)
    }
}
