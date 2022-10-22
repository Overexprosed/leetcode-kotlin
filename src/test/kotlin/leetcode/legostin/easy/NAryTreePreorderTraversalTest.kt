package leetcode.legostin.easy

import leetcode.legostin.model.Node
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NAryTreePreorderTraversalTest {

    private val target = NAryTreePreorderTraversal()

    @Test
    fun test1() {
        val root = Node(
            // 1 ary
            value = 1,
            children = listOf(
                // 2 ary
                Node(
                    value = 3,
                    children = listOf(
                        // 3 ary
                        Node(5),
                        // 3 ary
                        Node(6)
                    )
                ),
                // 2 ary
                Node(2),
                // 2 ary
                Node(4)
            )
        )
        target.preorder(root).let { resultList ->
            assertEquals(6, resultList.size)
            assertEquals(
                listOf(1, 3, 5, 6, 2, 4),
                resultList
            )
        }
    }
}
