package leetcode.legostin.string

/**
 * Given two strings ransomNote and magazine,
 * return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 */
class RansomNote {

    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val occurrences = IntArray(28)
        for (c in magazine.toCharArray()) {
            occurrences[c.code - 'a'.code]++
        }
        for (c in ransomNote.toCharArray()) {
            if (occurrences[c.code - 'a'.code] > 0) {
                occurrences[c.code - 'a'.code]--
            } else {
                return false
            }
        }
        return true
    }
}
