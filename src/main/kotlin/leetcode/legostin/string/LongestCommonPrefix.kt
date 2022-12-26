package leetcode.legostin.string

class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        val prefix = strs[0]
        var prefixLength = prefix.length
        for (currentString in strs) {
            var newPrefixLength = 0
            while (
                newPrefixLength < currentString.length &&
                newPrefixLength < prefixLength &&
                currentString[newPrefixLength] == prefix[newPrefixLength]
            ) {
                newPrefixLength++
            }
            if (newPrefixLength < prefixLength) {
                prefixLength = newPrefixLength
            }
            if (newPrefixLength == 0) break
        }
        return prefix.substring(0, prefixLength)
    }
}
