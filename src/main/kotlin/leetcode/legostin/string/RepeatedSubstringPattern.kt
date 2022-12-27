package leetcode.legostin.string

/**
 * Given a string s.
 * Check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
 */
class RepeatedSubstringPattern {

    fun repeatedSubstringPattern(s: String): Boolean {
        if (s.isEmpty()) return false

        for (i in s.length / 2 downTo 1) {
            if (s.length % i == 0) {
                val divisionFactor = s.length / i
                val subString = s.substring(0, i)
                val stringBuilder = StringBuilder()
                for (j in 0 until divisionFactor) {
                    stringBuilder.append(subString)
                }
                if (s == stringBuilder.toString()) {
                    return true
                }
            }
        }
        return false
    }
}
