package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CrawlerLogFolderTest {

    private val target = CrawlerLogFolder()

    @Test
    fun test1() {
        target.minOperations(logs = arrayOf("d1/", "d2/", "../", "d21/", "./")).let {
            assertThat(it).isEqualTo(2)
        }
    }

    @Test
    fun test2() {
        target.minOperations(logs = arrayOf("d1/", "d2/", "./", "d3/", "../", "d31/")).let {
            assertThat(it).isEqualTo(3)
        }
    }

    @Test
    fun test3() {
        target.minOperations(logs = arrayOf("d1/", "../", "../", "../")).let {
            assertThat(it).isEqualTo(0)
        }
    }
}
