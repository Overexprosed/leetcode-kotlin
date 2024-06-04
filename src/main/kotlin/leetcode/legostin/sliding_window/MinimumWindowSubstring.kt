package leetcode.legostin.sliding_window

class MinimumWindowSubstring {

    fun minWindow(s: String, t: String): String {
        if (t.isEmpty()) return ""

        val resultIndex = arrayListOf(0, -1)
        var resultLength = Integer.MAX_VALUE

        val desiredMap = mutableMapOf<Char, Int>()
        val window  = mutableMapOf<Char, Int>()

        val desiredCount = t.length
        var currentCount = 0

        t.forEach { c ->
            desiredMap.compute(c) { _, count -> (count ?: 0) + 1 }
        }

        var pointer1 = 0

        for (pointer2 in s.indices) {
            desiredMap[s[pointer2]]?.let { desiredCharCount ->
                val currentCharCount = window[s[pointer2]] ?: 0

                if (currentCharCount < desiredCharCount) {
                    currentCount++
                }
                window[s[pointer2]] = currentCharCount + 1
            }

            while (currentCount == desiredCount) {
                val newLength = pointer2 - pointer1
                if (newLength < resultLength) {
                    resultLength = newLength

                    resultIndex[0] = pointer1
                    resultIndex[1] = pointer2
                }

                window[s[pointer1]]?.let { currentCharCount ->
                    if (currentCharCount == desiredMap[s[pointer1]]) {
                        currentCount--
                    }
                    window[s[pointer1]] = currentCharCount - 1
                }

                pointer1++
            }
        }

        return s.substring(resultIndex[0], resultIndex[1] + 1)
    }
}
