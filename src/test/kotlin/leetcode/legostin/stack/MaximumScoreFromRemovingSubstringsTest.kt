package leetcode.legostin.stack

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaximumScoreFromRemovingSubstringsTest {

    private val target = MaximumScoreFromRemovingSubstrings()

    @Test
    fun test1() {
        target.maximumGain(s = "cdbcbbaaabab", x = 4, y = 5).let {
            assertThat(it).isEqualTo(19)
        }
    }

    @Test
    fun test2() {
        target.maximumGain(s = "aabbaaxybbaabb", x = 5, y = 4).let {
            assertThat(it).isEqualTo(20)
        }
    }
}
