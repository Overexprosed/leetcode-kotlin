package leetcode.legostin.model

data class ListNode (
    var value: Int = 0,
    var next: ListNode? = null
) {

    override fun toString(): String {
        val result = mutableListOf<Int>()
        var node: ListNode? = this

        // prevent endless while if cycle exists
        var counter = 0

        while (node != null) {
            counter++

            result.add(node.value)
            node = node.next

            if (counter == 1_000) {
                return "Error: cycle detected"
            }
        }

        return result.toString()
    }
}
