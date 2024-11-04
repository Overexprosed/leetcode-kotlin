package leetcode.legostin.linked_list

import leetcode.legostin.util.toListNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPointsTest {

    private val target = FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints()

    @Test
    fun test1() {
        target.nodesBetweenCriticalPoints(head = "[3, 1]".toListNode()).let {
            assertThat(it).isEqualTo(intArrayOf(-1, -1))
        }
    }

    @Test
    fun test2() {
        target.nodesBetweenCriticalPoints(head = "[5, 3, 1, 2, 5, 1, 2]".toListNode()).let {
            assertThat(it).isEqualTo(intArrayOf(1, 3))
        }
    }

    @Test
    fun test3() {
        target.nodesBetweenCriticalPoints(head = "[1, 3, 2, 2, 3, 2, 2, 2, 7]".toListNode()).let {
            assertThat(it).isEqualTo(intArrayOf(3, 3))
        }
    }
}
