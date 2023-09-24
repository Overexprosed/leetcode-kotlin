package leetcode.legostin.two_pointers

class ValidPalindrome {

    fun isPalindrome(s: String): Boolean {
        var pointer1 = 0
        var pointer2 = s.length - 1

        while (pointer1 <= pointer2) {
            if (!s.elementAt(pointer1).isLetterOrDigit()) {
                pointer1++
                continue
            }
            if (!s.elementAt(pointer2).isLetterOrDigit()) {
                pointer2--
                continue
            }
            if (!s.elementAt(pointer1).equals(s.elementAt(pointer2), true)) {
                return false
            }
            pointer1++
            pointer2--
        }
        return true
    }
}
