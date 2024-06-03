package leetcode.legostin.two_pointers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppendCharactersToStringToMakeSubsequenceTest {

    private val target = AppendCharactersToStringToMakeSubsequence()

    @Test
    fun test1() {
        target.appendCharacters(
            s = "coaching",
            t = "coding"
        ).let {
            assertThat(it).isEqualTo(4)
        }
    }

    @Test
    fun test2() {
        target.appendCharacters(
            s = "abcde",
            t = "a"
        ).let {
            assertThat(it).isEqualTo(0)
        }
    }

    @Test
    fun test3() {
        target.appendCharacters(
            s = "z",
            t = "abcde"
        ).let {
            assertThat(it).isEqualTo(5)
        }
    }
}
