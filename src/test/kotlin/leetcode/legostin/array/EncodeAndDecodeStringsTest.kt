package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EncodeAndDecodeStringsTest {

    private val target = EncodeAndDecodeStrings()

    @Test
    fun test1() {
        val strs = listOf("Hello", "World")
        val strsEncoded = target.encode(strs)

        assertThat(strsEncoded).isEqualTo("5#Hello5#World")

        val strsDecoded = target.decode(strsEncoded)

        assertThat(strsDecoded).isEqualTo(strs)
    }

    @Test
    fun test2() {
        val strs = emptyList<String>()
        val strsEncoded = target.encode(strs)

        assertThat(strsEncoded).isEqualTo("")

        val strsDecoded = target.decode(strsEncoded)

        assertThat(strsDecoded).isEqualTo(strs)
    }
}
