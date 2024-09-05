package leetcode.legostin.model

data class ListNode (
    var value: Int = 0,
    var next: ListNode? = null
) {

    fun toValueList(): List<Int> {
        val values = mutableListOf<Int>()
        var modify: ListNode? = this

        while (modify != null) {
            values.add(modify.value)
            modify = modify.next
        }

        return values
    }
}
