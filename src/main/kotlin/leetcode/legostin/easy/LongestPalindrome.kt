package leetcode.legostin.easy

/**
 * Given a string s which consists of lowercase or uppercase letters,
 * return the length of the longest palindrome that can be built with those letters.
 *
 * Letters are case-sensitive, for example, "Aa" is not considered a palindrome here.
 */
class LongestPalindrome {

    fun longestPalindrome(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        var count = 0
        val set = HashSet<Char>()
        for (char in s.toCharArray()) {
            if (set.contains(char)) {
                set.remove(char)
                count++
            } else {
                set.add(char)
            }
        }
        if (set.isNotEmpty()) {
            count = count * 2 + 1
        } else {
            count *= 2
        }
        return count
    }
}
