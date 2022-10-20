package leetcode.legostin.easy

class IsSubsequence {

    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) {
            return true
        }

        var sIndex = 0
        var tIndex = 0
        while (tIndex < t.length) {
            val sChar = s[sIndex]
            val tChar = t[tIndex]

            if (sChar == tChar) {
                sIndex++
                tIndex++
                if (sIndex == s.length) {
                    return true
                }
            } else {
                tIndex++
            }
        }
        return false
    }
}
