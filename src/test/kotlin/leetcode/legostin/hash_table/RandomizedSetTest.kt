package leetcode.legostin.hash_table

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RandomizedSetTest {

    @Test
    fun test1() {
        val target = RandomizedSet()

        target.insert(1).let { assertThat(it).isTrue }
        target.remove(2).let { assertThat(it).isFalse }
        target.insert(2).let { assertThat(it).isTrue }
        target.remove(1).let { assertThat(it).isTrue }
        target.insert(2).let { assertThat(it).isFalse }
    }

    @Test
    fun test2() {
        val target = RandomizedSet()

        target.insert(1).let { assertThat(it).isTrue }
        target.remove(2).let { assertThat(it).isFalse }
        target.insert(2).let { assertThat(it).isTrue }
        target.remove(1).let { assertThat(it).isTrue }
        target.getRandom().let { assertThat(it).isEqualTo(2) }
    }

    @Test
    fun test3() {
        val target = RandomizedSet()

        target.insert(1).let { assertThat(it).isTrue }
        target.remove(1).let { assertThat(it).isTrue }
        target.insert(1).let { assertThat(it).isTrue }
        target.remove(1).let { assertThat(it).isTrue }
    }
}
