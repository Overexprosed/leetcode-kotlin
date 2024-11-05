package leetcode.legostin.string

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinimumNumberOfChangesToMakeBinaryStringBeautifulTest {

    private val target = MinimumNumberOfChangesToMakeBinaryStringBeautiful()

    @Test
    fun test1() {
        target.minChanges("1001").also { assertThat(it).isEqualTo(2) }
    }

    @Test
    fun test2() {
        target.minChanges("10").also { assertThat(it).isEqualTo(1) }
    }

    @Test
    fun test3() {
        target.minChanges("0000").also { assertThat(it).isEqualTo(0) }
    }
}
