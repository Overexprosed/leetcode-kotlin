package leetcode.legostin.stack

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimplifyPathTest {

    private val target = SimplifyPath()

    @Test
    fun test1() {
        target.simplifyPath(path = "/home/").also { assertThat(it).isEqualTo("/home") }
    }

    @Test
    fun test2() {
        target.simplifyPath(path = "/home//foo/").also { assertThat(it).isEqualTo("/home/foo") }
    }

    @Test
    fun test3() {
        target
            .simplifyPath(path = "/home/user/Documents/../Pictures")
            .also { assertThat(it).isEqualTo("/home/user/Pictures") }
    }

    @Test
    fun test4() {
        target.simplifyPath(path = "/../").also { assertThat(it).isEqualTo("/") }
    }

    @Test
    fun test5() {
        target.simplifyPath(path = "/.../a/../b/c/../d/./").also { assertThat(it).isEqualTo("/.../b/d") }
    }
}
