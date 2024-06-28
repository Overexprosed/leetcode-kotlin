package leetcode.legostin.graph

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaximumTotalImportanceOfRoadsTest {

    private val target = MaximumTotalImportanceOfRoads()

    @Test
    fun test1() {
        target.maximumImportance(
            n = 5,
            roads = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 2),
                intArrayOf(2, 3),
                intArrayOf(0, 2),
                intArrayOf(1, 3),
                intArrayOf(2, 4)
            )
        ).let {
            assertThat(it).isEqualTo(43)
        }
    }

    @Test
    fun test2() {
        target.maximumImportance(
            n = 5,
            roads = arrayOf(
                intArrayOf(0, 3),
                intArrayOf(2, 4),
                intArrayOf(1, 3)
            )
        ).let {
            assertThat(it).isEqualTo(20)
        }
    }
}
