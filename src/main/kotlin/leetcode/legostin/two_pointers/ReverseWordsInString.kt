package leetcode.legostin.two_pointers

/**
 * Given a string s, reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 */
class ReverseWordsInString {

    fun reverseWords(s: String): String {
        if (s.length <= 1) return s

        val length = s.length
        val chars = s.toCharArray()

        var startReverse: Int
        var index = 0
        while (index < chars.size) {
            startReverse = index
            while (index < length && chars[index] != ' ') {
                index++
            }
            swap(chars, startReverse, index - 1)
            index++
        }
        return chars.concatToString()
    }

    private fun swap(array: CharArray, i: Int, j: Int): CharArray {
        var first = i
        var second = j
        while (first < second) {
            val tmp = array[first]
            array[first] = array[second]
            array[second] = tmp
            first++
            second--
        }
        return array
    }
}
