package leetcode.legostin.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JewelsAndStonesTest {

    private val target = JewelsAndStones()

    @Test
    fun test1() {
        val result = target.numJewelsInStones(jewels = "aA", stones = "aAAbbbb")
        assertEquals(3, result)
    }

    @Test
    fun test2() {
        val result = target.numJewelsInStones(jewels = "z", stones = "ZZ")
        assertEquals(0, result)
    }
}
