package leetcode.legostin.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DetermineIfCellIsReachableAtGivenTimeTest {

    private var target = DetermineIfCellIsReachableAtGivenTime()

    @Test
    fun test1() {
        target.isReachableAtTime(sx = 2, sy = 4, fx = 7, fy = 7, t = 6).let { assertThat(it).isTrue }
    }

    @Test
    fun test2() {
        target.isReachableAtTime(sx = 3, sy = 1, fx = 7, fy = 3, t = 3).let { assertThat(it).isFalse }
    }

    @Test
    fun test3() {
        target.isReachableAtTime(sx = 1, sy = 1, fx = 1, fy = 1, t = 3).let { assertThat(it).isTrue }
    }

    @Test
    fun test4() {
        target.isReachableAtTime(sx = 1, sy = 1, fx = 1, fy = 3, t = 2).let { assertThat(it).isTrue }
    }

    @Test
    fun test5() {
        target.isReachableAtTime(sx = 1, sy = 1, fx = 1, fy = 4, t = 3).let { assertThat(it).isTrue }
    }

    @Test
    fun test6() {
        target.isReachableAtTime(sx = 1, sy = 2, fx = 1, fy = 2, t = 1).let { assertThat(it).isFalse }
    }

    @Test
    fun test7() {
        target.isReachableAtTime(sx = 1, sy = 1, fx = 1, fy = 2, t = 0).let { assertThat(it).isFalse }
    }

    @Test
    fun test8() {
        target.isReachableAtTime(sx = 1, sy = 3, fx = 1, fy = 3, t = 0).let { assertThat(it).isTrue }
    }
}
