package leetcode.legostin.hash_table

class ArrayDuplicates {

    fun findDuplicates(nums: IntArray): List<Int> {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val count = map.getOrDefault(nums[i], 0) + 1
            map[nums[i]] = count
        }
        return map.entries.filter { entry -> entry.value == 2 }.map { entry -> entry.key }.toList()
    }
}
