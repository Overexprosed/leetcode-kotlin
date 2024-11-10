package leetcode.legostin.linked_list

class LruCache(
    private val capacity: Int
) {

    private var count = 0
    private val cache = HashMap<Int, DLinkedNode>()

    private var head = DLinkedNode()
    private var tail = DLinkedNode()

    init {
        head.post = tail
        tail.pre = head
    }

    fun get(key: Int): Int {
        return cache[key]?.let { moveToHead(it); it.value } ?: -1
    }

    fun put(key: Int, value: Int) {
        val node = cache[key]

        if (node == null) {
            val newNode = DLinkedNode(key = key, value = value)

            cache[key] = newNode
            addNode(newNode)

            count++

            if (count > capacity) {
                // pop the tail
                val tailNode = popTail()
                cache.remove(tailNode.key)
                count--
            }
        } else {
            // update
            node.value = value
            moveToHead(node)
        }
    }

    private fun moveToHead(node: DLinkedNode) {
        removeNode(node)
        addNode(node)
    }

    private fun removeNode(node: DLinkedNode) {
        val pre = node.pre
        val post = node.post

        pre?.post = post
        post?.pre = pre
    }

    /**
     * Add after head.
     */
    private fun addNode(node: DLinkedNode) {
        // head is dummy and should always stay as the first node
        node.pre = head
        node.post = head.post

        head.post?.pre = node
        head.post = node
    }

    private fun popTail(): DLinkedNode {
        return tail.pre!!.also { removeNode(it) } // tail is dummy, tail.pre - actual tail
    }

    private data class DLinkedNode(
        var key: Int? = null,
        var value: Int = 0,
        var post: DLinkedNode? = null,
        var pre: DLinkedNode? = null
    )
}
