package leetcode.legostin.array

class GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return strs.groupBy { it.toCharArray().sorted() }.map { it.value }
    }
}
