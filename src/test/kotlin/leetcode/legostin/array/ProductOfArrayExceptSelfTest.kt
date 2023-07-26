package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductOfArrayExceptSelfTest {

    private val target = ProductOfArrayExceptSelf()

    @Test
    fun test1() {
        val result = target.productExceptSelf2(intArrayOf(1, 2, 3, 4))

        assertThat(result.size).isEqualTo(4)

        assertThat(result[0]).isEqualTo(24)
        assertThat(result[1]).isEqualTo(12)
        assertThat(result[2]).isEqualTo(8)
        assertThat(result[3]).isEqualTo(6)
    }

    @Test
    fun test2() {
        val result = target.productExceptSelf2(intArrayOf(1, 1))

        assertThat(result.size).isEqualTo(2)

        assertThat(result[0]).isEqualTo(1)
        assertThat(result[1]).isEqualTo(1)
    }

    @Test
    fun test3() {
        val result = target.productExceptSelf2(intArrayOf(0, 0))

        assertThat(result.size).isEqualTo(2)

        assertThat(result[0]).isEqualTo(0)
        assertThat(result[1]).isEqualTo(0)
    }
}
