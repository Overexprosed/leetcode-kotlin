package leetcode.legostin.hash_table

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FindCommonCharactersTest {

    private val target = FindCommonCharacters()

    @Test
    fun test1() {
        target.commonChars(words = arrayOf("bella", "label", "roller")).let {
            assertThat(it).isEqualTo(listOf("e", "l", "l"))
        }
    }

    @Test
    fun test2() {
        target.commonChars(words = arrayOf("cool", "lock", "cook")).let {
            assertThat(it).isEqualTo(listOf("c", "o"))
        }
    }
}
