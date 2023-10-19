package leetcode.legostin.two_pointers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BackspaceStringCompareTest {

    private val target = BackspaceStringCompare()

    @Test
    fun test1() {
        target.backspaceCompare(s = "ab#c", t = "ad#c").let { assertThat(it).isTrue }
    }

    @Test
    fun test2() {
        target.backspaceCompare(s = "ab##", t = "c#d#").let { assertThat(it).isTrue }
    }

    @Test
    fun test3() {
        target.backspaceCompare(s = "a#c", t = "b").let { assertThat(it).isFalse }
    }
}
