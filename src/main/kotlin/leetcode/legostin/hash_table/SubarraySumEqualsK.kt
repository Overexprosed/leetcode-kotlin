package leetcode.legostin.hash_table

class SubarraySumEqualsK {

    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        var sum = 0

        val prefixMap = mutableMapOf<Int, Int>()
        prefixMap[0] = 1

        nums.forEach { num ->
            sum += num
            if (prefixMap.containsKey(sum - k)) {
                count += prefixMap[sum - k]!!
            }
            prefixMap[sum] = prefixMap.getOrDefault((sum), 0) + 1
        }

        return count
    }
}
