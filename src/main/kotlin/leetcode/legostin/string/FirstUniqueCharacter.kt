package leetcode.legostin.string

class FirstUniqueCharacter {

    fun firstUniqChar(s: String): Int {
        val occurrences = IntArray(28)

        for (c in s.toCharArray()) {
            occurrences[c.code - 'a'.code] += 1
        }

        for (i in s.indices) {
            val count = occurrences[s[i].code - 'a'.code]
            if (count == 1) {
                return i
            }
        }
        return -1
    }
}
