package leetcode.legostin.array

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class ValidAnagramTest {

    private val target = ValidAnagram()

    @Test
    fun test1() {
        val result = target.isAnagram(s = "anagram", t = "nagaram")
        assertTrue(result)
    }

    @Test
    fun test2() {
        val result = target.isAnagram(s = "rat", t = "car")
        assertFalse(result)
    }
}
