package leetcode.legostin.hash_table

import java.util.LinkedList

/**
 * Временная сложность каждой функции O(1).
 */
class RandomizedSet {

    private val map = mutableMapOf<Int, Int>() // key: value, value: index in the list

    private val list = LinkedList<Int>()

    fun insert(value: Int): Boolean =
        if (!map.containsKey(value)) {
            map[value] = list.size
            list.add(value)

            true
        } else false

    fun remove(value: Int): Boolean =
        if (map.containsKey(value)) {
            val index = map[value]!! // индекс удаляемого элемента

            val lastElement = list.last()

            list[index] = lastElement
            list.pop()

            map[lastElement] = index
            map.remove(value)

            true
        } else false

    fun getRandom(): Int {
        return list.random()
    }
}


fun main() {
    val list = LinkedList<Int>()
    list.add(0, 1)
    println("List: $list")

    list.removeAt(0)
    list.add(0, 2)
    println("List: $list")
}
