package leetcode.legostin.string

class LongestPalindromicSubstring {

    fun longestPalindrome(s: String): String {
        var result = ""

        for (i in s.toCharArray().indices) {
            // odd length
            var left = i
            var right = i

            while (left >= 0 && right < s.length && s[left] == s[right]) {
                if (right - left + 1 > result.length) {
                    result = s.substring(left, right + 1)
                }
                left--
                right++
            }

            // even length
            left = i
            right = i + 1

            while (left >= 0 && right < s.length && s[left] == s[right]) {
                if (right - left + 1 > result.length) {
                    result = s.substring(left, right + 1)
                }
                left--
                right++
            }
        }
        return result
    }
}
