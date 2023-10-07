package leetcode.legostin.model

class MyHashMap {

    private val limit = 1000

    private val array = Array(limit) { ListNode() }

    fun put(key: Int, value: Int) {
        var current: ListNode? = array[hash(key)]

        while (current?.next != null) {
            if (current.next!!.key == key) {
                current.next!!.value = value
                return
            }
            current = current.next
        }
        current!!.next = ListNode(key = key, value = value)
    }

    fun get(key: Int): Int {
        var current: ListNode? = array[hash(key)].next

        while (current != null) {
            if (current.key == key) {
                return current.value
            }
            current = current.next
        }
        return -1
    }

    fun remove(key: Int) {
        var current: ListNode? = array[hash(key)]

        while (current?.next != null) {
            if (current.next!!.key == key) {
                current.next = current.next?.next
                return
            }
            current = current.next
        }
    }

    private fun hash(key: Int): Int = key % limit

    private data class ListNode (
        val key: Int = 0,
        var value: Int = 0,
        var next: ListNode? = null
    )
}
