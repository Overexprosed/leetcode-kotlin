package leetcode.legostin.array

class GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<Int, MutableList<String>>()

        strs.forEach { str ->
            val key = computeKey(str)
            map.computeIfAbsent(key) { mutableListOf() }.add(str)
        }

        return map.values.toList()
    }

    private fun computeKey(str: String): Int {
        val array = IntArray(26)

        str.toCharArray().forEach { char ->
            array[char - 'a'] = array[char - 'a'] + 1
        }

        return array.contentHashCode()
    }
}
