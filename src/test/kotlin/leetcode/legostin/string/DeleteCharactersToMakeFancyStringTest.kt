package leetcode.legostin.string

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DeleteCharactersToMakeFancyStringTest {

    private val target = DeleteCharactersToMakeFancyString()

    @Test
    fun test1() {
        target.makeFancyString("leeetcode").also { assertThat(it).isEqualTo("leetcode") }
    }

    @Test
    fun test2() {
        target.makeFancyString("aaabaaaa").also { assertThat(it).isEqualTo("aabaa") }
    }

    @Test
    fun test3() {
        target.makeFancyString("aab").also { assertThat(it).isEqualTo("aab") }
    }
}
