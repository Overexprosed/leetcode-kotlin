package leetcode.legostin.string

/**
 * Return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 */
class NeedleInHaystack {

    fun strStr(haystack: String, needle: String): Int {
        if (haystack.isEmpty()) return 0
        return haystack.indexOf(needle)
    }
}
