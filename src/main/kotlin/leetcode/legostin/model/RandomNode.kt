package leetcode.legostin.model

data class RandomNode(
    val value: Int,
    var next: RandomNode? = null,
    var random: RandomNode? = null
) {

    override fun toString(): String = ""

    override fun hashCode(): Int {
        return 31 * value.hashCode() + (next?.value?.hashCode() ?: 0) + (random?.value?.hashCode() ?: 0)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RandomNode) return false
        return value == other.value && next == other.next && random == other.random
    }
}
