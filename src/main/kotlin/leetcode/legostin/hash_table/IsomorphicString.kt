package leetcode.legostin.hash_table

/**
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 */
class IsomorphicString {

    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val map = HashMap<Char, Char>()

        for (i in s.indices) {
            val sChar = s[i]
            val tChar = t[i]
            if (map.containsKey(sChar)) {
                if (map[sChar] != tChar) {
                    return false
                }
            } else if (map.containsValue(tChar)) {
                if (map[tChar] != sChar) {
                    return false
                }
            } else {
                map[sChar] = tChar
            }
        }
        return true
    }
}
