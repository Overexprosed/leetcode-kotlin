package leetcode.legostin.sliding_window

/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * In other words, return true if one of s1's permutations is the substring of s2.
 */
class PermutationInString {

    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false

        val frequencyMap = HashMap<Char, Int>()
        for (i in s1.length - 1 downTo 0) {
            frequencyMap[s1[i]] = frequencyMap.getOrDefault(s1[i], 0) + 1
        }
        var toBeMatched = frequencyMap.size

        var start = 0
        var end = 0
        while (end < s2.length) {
            if (frequencyMap.containsKey(s2[end])) {
                var count = frequencyMap[s2[end]]!!
                if (count == 1) {
                    toBeMatched--
                }
                frequencyMap[s2[end]] = count - 1
            }
            end++

            if (end - start > s1.length) {
                if (frequencyMap.containsKey(s2[start])) {
                    var count = frequencyMap[s2[start]]!!
                    if (count == 0) {
                        toBeMatched++
                    }
                    frequencyMap[s2[start]] = count + 1
                }
                start ++
            }
            if (toBeMatched == 0) {
                return true
            }
        }
        return false
    }
}
