package leetcode.legostin.string

class DetectCapital {

    fun detectCapitalUse(word: String): Boolean {
        val firstCapital = word[0].isUpperCase()
        var countCapital = 0
        for (i in word.indices) {
            countCapital = if (word[i].isUpperCase()) countCapital + 1 else countCapital
        }
        return (firstCapital && countCapital == 1) ||
                (firstCapital && countCapital == word.length) ||
                (!firstCapital && countCapital == 0)
    }
}
