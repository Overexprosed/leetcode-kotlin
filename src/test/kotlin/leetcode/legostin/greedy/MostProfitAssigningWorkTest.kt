package leetcode.legostin.greedy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MostProfitAssigningWorkTest {

    private val target = MostProfitAssigningWork()

    @Test
    fun test1() {
        target.maxProfitAssignment(
            difficulty = intArrayOf(2, 4, 6, 8, 10),
            profit = intArrayOf(10, 20, 30, 40, 50),
            worker = intArrayOf(4, 5, 6, 7)
        ).let { assertThat(it).isEqualTo(100) }
    }

    @Test
    fun test2() {
        target.maxProfitAssignment(
            difficulty = intArrayOf(85, 47, 57),
            profit = intArrayOf(24, 66, 99),
            worker = intArrayOf(40, 25, 25)
        ).let { assertThat(it).isEqualTo(0) }
    }

    @Test
    fun test3() {
        target.maxProfitAssignment(
            difficulty = intArrayOf(68, 35, 52, 47, 86),
            profit = intArrayOf(67, 17, 1, 81, 3),
            worker = intArrayOf(92, 10, 85, 84, 82)
        ).let { assertThat(it).isEqualTo(324) }
    }
}
