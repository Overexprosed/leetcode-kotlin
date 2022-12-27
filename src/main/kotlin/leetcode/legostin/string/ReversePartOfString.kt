package leetcode.legostin.string

/**
 * Given a string s and an integer k,
 * reverse the first k characters for every 2k characters counting from the start of the string.
 *
 * If there are fewer than k characters left,
 * reverse all of them. If there are less than 2k but greater than or equal to k characters,
 * then reverse the first k characters and leave the other as original.
 */
class ReversePartOfString {

    fun reverseStr(s: String, k: Int): String {
        if (k == 1 || s.isEmpty()) return s

        var i = 0
        val charArray = s.toCharArray()
        while (i < charArray.size) {
            swap(charArray, i, Math.min(i + k -1, charArray.size - 1))
            i += 2 * k
        }
        return charArray.concatToString()
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
