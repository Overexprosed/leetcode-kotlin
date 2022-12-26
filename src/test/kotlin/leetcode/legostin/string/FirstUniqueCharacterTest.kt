package leetcode.legostin.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FirstUniqueCharacterTest {

    private val target = FirstUniqueCharacter()

    @Test
    fun test1() {
        val result = target.firstUniqChar("leetcode")
        assertEquals(0, result)
    }

    @Test
    fun test2() {
        val result = target.firstUniqChar("loveleetcode")
        assertEquals(2, result)
    }

    @Test
    fun test3() {
        val result = target.firstUniqChar("aabb")
        assertEquals(-1, result)
    }
}
