package leetcode.legostin.sliding_window

class SubstringWithConcatenationOfAllWords {

    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val result = mutableListOf<Int>()
        val wordLength = words.first().length
        val frequencyMap = mutableMapOf<String, Int>()

        // init frequency map
        words.forEach { word ->
            val count = frequencyMap.getOrDefault(word, 0)
            frequencyMap[word] = count + 1
        }
        var frequencyMapCopy = frequencyMap.toMutableMap()

        var resultIndex = 0
        var localStartIndex = 0
        var wordCount = words.size
        val charArray = s.toCharArray()

        while ((localStartIndex + wordLength) < charArray.size + 1) {
            val localEndIndex = localStartIndex + wordLength

            if (localEndIndex <= charArray.size) {
                val currentWord = String(charArray.copyOfRange(localStartIndex, localEndIndex))
                val count = frequencyMapCopy[currentWord]

                if (count != null && count > 0) {
                    frequencyMapCopy[currentWord] = count - 1
                    wordCount--

                    if (wordCount == 0) {
                        // Последовательность завершилась успешно
                        result.add(resultIndex)

                        // Сбрасываем состояние для следующей последовательности
                        wordCount = words.size
                        frequencyMapCopy = frequencyMap.toMutableMap()

                        resultIndex += 1
                        localStartIndex = resultIndex
                    } else {
                        localStartIndex = localEndIndex
                    }
                } else {
                    // Последовательность сбилась
                    frequencyMapCopy = frequencyMap.toMutableMap()
                    wordCount = words.size

                    resultIndex += 1
                    localStartIndex = resultIndex
                }
            }
        }

        return result
    }
}
