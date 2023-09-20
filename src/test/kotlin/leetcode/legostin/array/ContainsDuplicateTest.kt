package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContainsDuplicateTest {

    private val target = ContainsDuplicate()

    @Test
    fun test1() {
        val result = target.containsDuplicate(intArrayOf(1, 2, 3, 1))
        assertThat(result).isTrue
    }

    @Test
    fun test2() {
        val result = target.containsDuplicate(intArrayOf(1, 2, 3, 4))
        assertThat(result).isFalse
    }

    @Test
    fun test3() {
        val result = target.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))
        assertThat(result).isTrue
    }
}
