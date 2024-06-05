package leetcode.legostin.hash_table

class FindCommonCharacters {

    fun commonChars(words: Array<String>): List<String> {
        val frequencyMap = mutableMapOf<Char, Int>()

        words.first().toCharArray().forEach { c ->
            frequencyMap[c] = frequencyMap.getOrDefault(c, 0) + 1
        }

        words.drop(0).forEach { word ->
            val localFrequencyMap = mutableMapOf<Char, Int>()

            word.toCharArray().forEach { c ->
                localFrequencyMap[c] = localFrequencyMap.getOrDefault(c, 0) + 1
            }

            frequencyMap.forEach { (char, count) ->
                localFrequencyMap.getOrDefault(char, 0).let {
                    frequencyMap[char] = count.coerceAtMost(it)
                }
            }
        }

        val result = mutableListOf<String>()

        frequencyMap.forEach { (char, count) ->
            for (i in 0 until count) {
                result.add(char.toString())
            }
        }

        return result
    }
}
