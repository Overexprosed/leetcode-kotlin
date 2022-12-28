package leetcode.legostin.hash_table

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */
class WordPattern {

    fun wordPattern(pattern: String, s: String): Boolean {
        val stringArray = s.split(" ")
        if (stringArray.size != pattern.length) return false

        val map = HashMap<Char, String>(stringArray.size)
        val check = HashSet<String>(stringArray.size)

        for (i in stringArray.indices) {
            val c = pattern[i]
            val currentStr = stringArray[i]
            if (!map.containsKey(c)) {
                if (check.contains(currentStr)) return false
                map[c] = currentStr
                check.add(currentStr)
            } else {
                val wordToCheck = map[c]
                if (wordToCheck != currentStr) return false
            }
        }
        return true
    }
}
