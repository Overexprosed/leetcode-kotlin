package leetcode.legostin.string

class DeleteCharactersToMakeFancyString {

    fun makeFancyString(s: String): String {
        val sb = StringBuilder()
        val array = s.toCharArray()

        for (i in 0 until array.size - 2) {
            if (array[i] != array[i + 1] || array[i + 1] != array[i + 2]) {
                sb.append(array[i])
            }
        }

        if (array.size >= 2) {
            sb.append(array[array.size - 2]).append(array[array.size - 1])
        } else if (array.size == 1) {
            sb.append(array[0])
        }

        return sb.toString()
    }
}
