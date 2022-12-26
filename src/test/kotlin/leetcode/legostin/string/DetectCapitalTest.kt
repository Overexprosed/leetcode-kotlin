package leetcode.legostin.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DetectCapitalTest {

    private val target = DetectCapital()

    @Test
    fun test1() {
        val result = target.detectCapitalUse("USA")
        assertTrue(result)
    }

    @Test
    fun test2() {
        val result = target.detectCapitalUse("Google")
        assertTrue(result)
    }

    @Test
    fun test3() {
        val result = target.detectCapitalUse("google")
        assertTrue(result)
    }

    @Test
    fun test4() {
        val result = target.detectCapitalUse("googlE")
        assertFalse(result)
    }

    @Test
    fun test5() {
        val result = target.detectCapitalUse("g")
        assertTrue(result)
    }

    @Test
    fun test6() {
        val result = target.detectCapitalUse("G")
        assertTrue(result)
    }
}
