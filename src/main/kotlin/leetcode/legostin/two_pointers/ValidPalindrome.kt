package leetcode.legostin.two_pointers

class ValidPalindrome {

    fun isPalindrome(s: String): Boolean {
        var pointer1 = 0
        var pointer2 = s.length - 1

        while (pointer1 <= pointer2) {
            val char1 = s[pointer1]
            if (!char1.isLetterOrDigit()) {
                pointer1++
                continue
            }

            val char2 = s[pointer2]
            if (!char2.isLetterOrDigit()) {
                pointer2--
                continue
            }

            if (!char1.equals(char2, true)) {
                return false
            }

            pointer1++
            pointer2--
        }
        return true
    }
}
