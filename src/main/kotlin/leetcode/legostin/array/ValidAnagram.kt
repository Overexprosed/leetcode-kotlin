package leetcode.legostin.array

class ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val array = Array(26) { 0 }
        for (i in s.indices) {
            array[s[i] - 'a']++
            array[t[i] - 'a']--
        }
        return array.all { it == 0 }
    }
}
