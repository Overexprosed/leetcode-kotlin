package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GroupAnagramsTest {

    private val target = GroupAnagrams()

    @Test
    fun test1() {
        target.groupAnagrams(strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")).let { result ->
            assertThat(result.size).isEqualTo(3)

            val sorted = result.map { it.sorted() }
            assertThat(sorted).contains(listOf("bat"))
            assertThat(sorted).contains(listOf("nat", "tan").sorted())
            assertThat(sorted).contains(listOf("ate", "eat", "tea").sorted())
        }
    }

    @Test
    fun test2() {
        target.groupAnagrams(strs = arrayOf("")).let { result ->
            assertThat(result.size).isEqualTo(1)

            assertThat(result[0]).isEqualTo(listOf(""))
        }
    }

    @Test
    fun test3() {
        target.groupAnagrams(strs = arrayOf("a")).let { result ->
            assertThat(result.size).isEqualTo(1)

            assertThat(result[0]).isEqualTo(listOf("a"))
        }
    }
}
