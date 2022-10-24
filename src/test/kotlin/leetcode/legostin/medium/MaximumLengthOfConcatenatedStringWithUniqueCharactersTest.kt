package leetcode.legostin.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumLengthOfConcatenatedStringWithUniqueCharactersTest {

    private val target = MaximumLengthOfConcatenatedStringWithUniqueCharacters()

    @Test
    fun test1() {
        assertEquals(4, target.maxLength(listOf("un", "iq", "ue")))
    }

    @Test
    fun test2() {
        assertEquals(6, target.maxLength(listOf("cha", "r", "act", "ers")))
    }
}
