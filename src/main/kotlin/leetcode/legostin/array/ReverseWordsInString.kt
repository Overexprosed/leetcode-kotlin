package leetcode.legostin.array

class ReverseWordsInString {

    fun reverseWords(s: String): String {
        val array = s.split(' ').reversed().filter { it.isNotBlank() }
        return array.joinToString(separator = " ") { it }
    }
}
