package leetcode.legostin.sliding_window

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinimumWindowSubstringTest {

    private val target = MinimumWindowSubstring()

    @Test
    fun test1() {
        target.minWindow(s = "ADOBECODEBANC", t = "ABC").let {
            assertThat(it).isEqualTo("BANC")
        }
    }

    @Test
    fun test2() {
        target.minWindow(s = "a", t = "a").let {
            assertThat(it).isEqualTo("a")
        }
    }

    @Test
    fun test3() {
        target.minWindow(s = "a", t = "aa").let {
            assertThat(it).isEqualTo("")
        }
    }
}
