package leetcode.legostin.sliding_window

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */
class LongestSubstringWithoutRepeatingCharacters {

    fun lengthOfLongestSubstring(s: String): Int {
        var max = 0
        val charArray = s.toCharArray()
        val frequencyMap = HashMap<Char, Int>()

        var left = 0
        for (right in charArray.indices) {
            frequencyMap[charArray[right]] = frequencyMap.getOrDefault(charArray[right], 0) + 1
            while (frequencyMap.getOrDefault(charArray[right], 0) > 1) {
                frequencyMap[charArray[left]] = frequencyMap[charArray[left]]!! - 1
                left++
            }
            max = max.coerceAtLeast(right - left + 1)
        }
        return max
    }
}
