package leetcode.legostin.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class RansomNoteTest {

    private val target = RansomNote()

    @Test
    fun test1() {
        assertFalse(target.canConstruct("s", ""))
    }

    @Test
    fun test2() {
        assertTrue(target.canConstruct("", ""))
    }

    @Test
    fun test3() {
        assertTrue(target.canConstruct("", "a"))
    }

    @Test
    fun test4() {
        assertTrue(target.canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"))
    }

    @Test
    fun test5() {
        assertTrue(target.canConstruct("gol", "gol"))
    }

    @Test
    fun test6() {
        assertTrue(target.canConstruct("g", "gggggggggggg"))
    }

    @Test
    fun test7() {
        assertFalse(target.canConstruct("asd", "qwe"))
    }

    @Test
    fun test8() {
        assertFalse(target.canConstruct("aa", "ab"))
    }
}
