package leetcode.legostin.linked_list

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LruCacheTest {

    @Test
    fun test1() {
        val lruCache = LruCache(2)
        lruCache.put(1, 1) // cache is {1=1}
        lruCache.put(2, 2) // cache is {2=2, 1=1}
        lruCache.get(1).also { assertThat(it).isEqualTo(1) } // cache is {1=1, 2=2}
        lruCache.put(3, 3) // cache is {3=3, 1=1}
        lruCache.get(2).also { assertThat(it).isEqualTo(-1) } // cache is {3=3, 1=1}
        lruCache.put(4, 4) // cache is {4=4, 3=3}
        lruCache.get(1).also { assertThat(it).isEqualTo(-1) } // cache is {4=4, 3=3}
        lruCache.get(3).also { assertThat(it).isEqualTo(3) } // cache is {3=3, 4=4}
        lruCache.get(4).also { assertThat(it).isEqualTo(4) } // cache is {4=4, 3=3}
    }
}
