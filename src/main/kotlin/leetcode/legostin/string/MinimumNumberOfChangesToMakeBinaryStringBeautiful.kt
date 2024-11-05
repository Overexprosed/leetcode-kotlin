package leetcode.legostin.string

class MinimumNumberOfChangesToMakeBinaryStringBeautiful {

    fun minChanges(s: String): Int {
        var count = 0

        for (i in 0 until s.length - 1 step 2) {
            if (s[i] != s[i + 1]) {
                count++
            }
        }

        return count
    }
}
