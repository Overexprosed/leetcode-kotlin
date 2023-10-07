package leetcode.legostin.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MyHashMapTest {

    @Test
    fun test1() {
        val myHashMap = MyHashMap()

        myHashMap.put(1, 100)
        val savedValue1 = myHashMap.get(1)
        assertThat(savedValue1).isEqualTo(100)

        myHashMap.put(1, 101)
        val savedValue2 = myHashMap.get(1)
        assertThat(savedValue2).isEqualTo(101)

        myHashMap.put(100, 888)
        myHashMap.put(1100, 999)

        val savedValue3 = myHashMap.get(100)
        assertThat(savedValue3).isEqualTo(888)

        val savedValue4 = myHashMap.get(1100)
        assertThat(savedValue4).isEqualTo(999)

        myHashMap.remove(1100)
        val savedValue5 = myHashMap.get(1100)
        assertThat(savedValue5).isEqualTo(-1)
    }

    @Test
    fun test2() {
        val myHashMap = MyHashMap()

        myHashMap.put(1, 1)
        myHashMap.put(2, 2)

        assertThat(
            myHashMap.get(1)
        ).isEqualTo(1)

        assertThat(
            myHashMap.get(3)
        ).isEqualTo(-1)

        myHashMap.put(2, 1)
        assertThat(
            myHashMap.get(2)
        ).isEqualTo(1)

        myHashMap.remove(2)
        assertThat(
            myHashMap.get(2)
        ).isEqualTo(-1)
    }
}
