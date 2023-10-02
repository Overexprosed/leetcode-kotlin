package leetcode.legostin.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RemoveColoredPiecesIfBothNeighborsAreTheSameColorTest {

    private val target = RemoveColoredPiecesIfBothNeighborsAreTheSameColor()

    @Test
    fun test1() {
        val result = target.winnerOfGame(colors = "AAABABB")
        assertThat(result).isTrue // Alice wins
    }

    @Test
    fun test2() {
        val result = target.winnerOfGame(colors = "AA")
        assertThat(result).isFalse // Bob wins, Alice can not move
    }

    @Test
    fun test3() {
        val result = target.winnerOfGame(colors = "ABBBBBBBAAA")
        assertThat(result).isFalse // Bob wins
    }
}
