package leetcode.legostin.breadth_first_search

import leetcode.legostin.model.Node
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

class MaximumDepthOfNArrayTreeTest {

    private val target = MaximumDepthOfNArrayTree()

    @Test
    fun test1() {
        val root = Node(
            1, listOf(
                Node(
                    3, listOf(
                        Node(5, emptyList()),
                        Node(6, emptyList())
                    )
                ),
                Node(2, emptyList()),
                Node(4, emptyList())
            )
        )
        val output: Int = target.maxDepth(root)
        assertEquals(3, output)
    }

    @Test
    fun test2() {
        val root = Node(
            1, listOf(
                Node(2, emptyList()),
                Node(
                    3, listOf(
                        Node(6, emptyList()),
                        Node(
                            7, listOf(
                                Node(
                                    11, listOf(
                                        Node(14, emptyList())
                                    )
                                )
                            )
                        )
                    )
                ),
                Node(
                    4, listOf(
                        Node(
                            8, listOf(
                                Node(12, emptyList())
                            )
                        )
                    )
                ),
                Node(
                    5, Arrays.asList(
                        Node(
                            9, listOf(
                                Node(13, emptyList())
                            )
                        ),
                        Node(10, emptyList())
                    )
                )
            )
        )
        val output: Int = target.maxDepth(root)
        assertEquals(5, output)
    }
}
