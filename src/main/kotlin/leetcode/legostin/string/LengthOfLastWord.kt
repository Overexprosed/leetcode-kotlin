package leetcode.legostin.string

class LengthOfLastWord {

    fun lengthOfLastWord(s: String): Int {
        var len: Int = s.length - 1

        while (len != -1 && s[len] == ' ') { // remove all the back white spaces
            len--
        }
        if (len == -1) return 0

        var count = 0
        val noSpaceSize = s.length - 1 - len // length without the back white spaces
        while (count != s.length - noSpaceSize && s[len] != ' ') {
            count++
            len--
        }
        return count
    }
}
