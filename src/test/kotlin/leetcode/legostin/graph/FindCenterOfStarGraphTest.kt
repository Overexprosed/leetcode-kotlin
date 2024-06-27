package leetcode.legostin.graph

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FindCenterOfStarGraphTest {

    private val target = FindCenterOfStarGraph()

    @Test
    fun test1() {
        target.findCenter(
            edges = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(2, 3),
                intArrayOf(4, 2)
            )
        ).let {
            assertThat(it).isEqualTo(2)
        }
    }

    @Test
    fun test2() {
        target.findCenter(
            edges = arrayOf(
                intArrayOf(1, 2),
                intArrayOf(5, 1),
                intArrayOf(1, 3),
                intArrayOf(1, 4)
            )
        ).let {
            assertThat(it).isEqualTo(1)
        }
    }
}
