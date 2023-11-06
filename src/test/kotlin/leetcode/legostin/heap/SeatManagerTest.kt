package leetcode.legostin.heap

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SeatManagerTest {

    @Test
    fun test1() {
        val target = SeatManager(n = 5)

        target.reserve().let { assertThat(it).isEqualTo(1) }
        target.reserve().let { assertThat(it).isEqualTo(2) }

        target.unreserve(2)

        target.reserve().let { assertThat(it).isEqualTo(2) }
        target.reserve().let { assertThat(it).isEqualTo(3) }
        target.reserve().let { assertThat(it).isEqualTo(4) }
        target.reserve().let { assertThat(it).isEqualTo(5) }

        target.unreserve(5)
    }
}
