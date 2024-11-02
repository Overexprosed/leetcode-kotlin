package leetcode.legostin.string

/**
 * A sentence is circular if:
 *   - (1) the last character of the last word is equal to the first character of the first word
 *   - (2) the last character of a word is equal to the first character of the next word
 */
class CircularSentence {

    fun isCircularSentence(sentence: String): Boolean {
        val length = sentence.length

        if (sentence[0] != sentence[length - 1]) {
            return false // 1st condition isn't met
        }

        for (i in sentence.indices) {
            if (sentence[i] == ' ' && sentence[i - 1] != sentence[i + 1]) {
                return false // 2nd condition isn't met
            }
        }

        return true
    }
}
