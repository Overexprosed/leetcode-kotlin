package leetcode.legostin.array

class EncodeAndDecodeStrings {

    fun encode(strs: List<String>): String {
        val stringBuilder = StringBuilder()

        strs.forEach { str ->
            stringBuilder.append(str.length)
            stringBuilder.append("#")
            stringBuilder.append(str)
        }

        return stringBuilder.toString()
    }

    fun decode(str: String): List<String> {
        var pointer = 0
        val result = mutableListOf<String>()

        while (pointer < str.length) {
            var length = 0

            // Собираем длину строки
            while (str[pointer] != '#') {
                val digit = str[pointer].digitToInt()
                length = length * 10 + digit

                pointer ++
            }

            val start = pointer + 1
            val end = pointer + length

            str.substring(start, pointer + length + 1).also { result.add(it) }
            pointer = end + 1
        }

        return result
    }
}
