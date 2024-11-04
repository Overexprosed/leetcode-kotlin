package leetcode.legostin.string

class StringCompression3 {

    fun compressedString(word: String): String {
        val stringBuilder = StringBuilder()

        val length = word.length
        var previousChar = word[0]
        var counter = 1

        for (i in 1 until length) {
            if (word[i] == previousChar && counter < 9) {
                counter++
            } else {
                stringBuilder.append("$counter$previousChar")
                previousChar = word[i]
                counter = 1
            }
        }

        return stringBuilder.append("$counter$previousChar").toString()
    }
}
