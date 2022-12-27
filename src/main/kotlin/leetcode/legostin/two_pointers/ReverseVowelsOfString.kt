package leetcode.legostin.two_pointers

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
 */
class ReverseVowelsOfString {

    fun reverseVowels(s: String): String {
        val vowels = HashSet(listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'))

        var first = 0
        var second = s.length - 1

        val strChar = s.toCharArray()
        while (first < second) {
            while (first < second && !vowels.contains(strChar[first])) {
                first++
            }
            while (first < second && !vowels.contains(strChar[second])) {
                second--
            }
            val tmp: Char = strChar[first]
            strChar[first] = strChar[second]
            strChar[second] = tmp
            first++
            second--
        }
        return strChar.concatToString()
    }
}
