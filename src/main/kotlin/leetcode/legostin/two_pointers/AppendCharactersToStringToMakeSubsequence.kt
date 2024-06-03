package leetcode.legostin.two_pointers

class AppendCharactersToStringToMakeSubsequence {

    /**
     * subsequence - в той же последовательности.
     */
    fun appendCharacters(s: String, t: String): Int {
        val sCharArray = s.toCharArray()
        val tCharArray = t.toCharArray()

        var sPointer = 0
        var tPointer = 0

        while (sPointer < s.length && tPointer < t.length) {
            if (sCharArray[sPointer] == tCharArray[tPointer]) {
                sPointer++
                tPointer++
            } else {
                sPointer++
            }
        }

        return t.length - tPointer
    }
}
