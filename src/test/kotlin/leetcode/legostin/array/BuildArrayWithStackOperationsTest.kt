package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BuildArrayWithStackOperationsTest {

    private val target = BuildArrayWithStackOperations()

    @Test
    fun test1() {
        val result = target.buildArray(target = intArrayOf(1, 3), n = 3)

        val expected = listOf("Push", "Push", "Pop", "Push")
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun test2() {
        val result = target.buildArray(target = intArrayOf(1, 2, 3), n = 3)

        val expected = listOf("Push", "Push", "Push")
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun test3() {
        val result = target.buildArray(target = intArrayOf(1, 2), n = 4)

        val expected = listOf("Push", "Push")
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun test4() {
        val result = target.buildArray(target = intArrayOf(2, 3, 4), n = 4)

        val expected = listOf("Push", "Pop", "Push", "Push", "Push")
        assertThat(result).isEqualTo(expected)
    }
}
