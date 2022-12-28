package leetcode.legostin.two_pointers

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 */
class ReverseString {

    fun reverseString(s: CharArray) {
        if (s.size < 2) return

        var first = 0
        var second = s.size - 1
        while (first < second) {
            val tmp = s[second]
            s[second] = s[first]
            s[first] = tmp
            first++
            second--
        }
    }
}
