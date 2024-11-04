package leetcode.legostin.string

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StringCompression3Test {

    private val target = StringCompression3()

    @Test
    fun test1() {
        target.compressedString("abcde").also { assertThat(it).isEqualTo("1a1b1c1d1e") }
    }

    @Test
    fun test2() {
        target.compressedString("aaaaaaaaaaaaaabb").also { assertThat(it).isEqualTo("9a5a2b") }
    }

    @Test
    fun test3() {
        target.compressedString("aaaaaaaaa").also { assertThat(it).isEqualTo("9a") }
    }
}
