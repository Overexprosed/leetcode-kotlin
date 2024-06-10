package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HeightCheckerTest {

    private val target = HeightChecker()

    @Test
    fun test1() {
        target.heightChecker(heights = intArrayOf(1, 1, 4, 2, 1, 3)).let {
            assertThat(it).isEqualTo(3)
        }
    }

    @Test
    fun test2() {
        target.heightChecker(heights = intArrayOf(5, 1, 2, 3, 4)).let {
            assertThat(it).isEqualTo(5)
        }
    }

    @Test
    fun test3() {
        target.heightChecker(heights = intArrayOf(1, 2, 3, 4, 5)).let {
            assertThat(it).isEqualTo(0)
        }
    }
}
