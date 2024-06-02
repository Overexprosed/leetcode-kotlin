package leetcode.legostin.sliding_window

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubstringWithConcatenationOfAllWordsTest {

    val target = SubstringWithConcatenationOfAllWords()

    @Test
    fun test1() {
        target.findSubstring(s = "barfoothefoobarman", words = arrayOf("foo", "bar")).let {
            assertThat(it.size).isEqualTo(2)

            assertThat(it[0]).isEqualTo(0)
            assertThat(it[1]).isEqualTo(9)
        }
    }

    @Test
    fun test2() {
        target.findSubstring(s = "wordgoodgoodgoodbestword", words = arrayOf("word", "good", "best", "word")).let {
            assertThat(it).isEmpty()
        }
    }

    @Test
    fun test3() {
        target.findSubstring(s = "barfoofoobarthefoobarman", words = arrayOf("bar", "foo", "the")).let {
            assertThat(it.size).isEqualTo(3)

            assertThat(it[0]).isEqualTo(6)
            assertThat(it[1]).isEqualTo(9)
            assertThat(it[2]).isEqualTo(12)
        }
    }

    @Test
    fun test4() {
        target.findSubstring(
            s = "lingmindraboofooowingdingbarrwingmonkeypoundcake",
            words = arrayOf("fooo", "barr", "wing", "ding", "wing")
        ).let {
            assertThat(it.size).isEqualTo(1)

            assertThat(it[0]).isEqualTo(13)
        }
    }

    @Test
    fun test5() {
        target.findSubstring(
            s = "wordgoodgoodgoodbestword",
            words = arrayOf("word", "good", "best", "good")
        ).let {
            assertThat(it.size).isEqualTo(1)

            assertThat(it[0]).isEqualTo(8)
        }
    }

    @Test
    fun test6() {
        target.findSubstring(
            s = "aaaaaaaaaaaaaa",
            words = arrayOf("aa", "aa")
        ).let {
            assertThat(it.size).isEqualTo(11)

            assertThat(it[0]).isEqualTo(0)
            assertThat(it[1]).isEqualTo(1)
            assertThat(it[2]).isEqualTo(2)
            assertThat(it[3]).isEqualTo(3)
            assertThat(it[4]).isEqualTo(4)
            assertThat(it[5]).isEqualTo(5)
            assertThat(it[6]).isEqualTo(6)
            assertThat(it[7]).isEqualTo(7)
            assertThat(it[8]).isEqualTo(8)
            assertThat(it[9]).isEqualTo(9)
            assertThat(it[10]).isEqualTo(10)
        }
    }
}
