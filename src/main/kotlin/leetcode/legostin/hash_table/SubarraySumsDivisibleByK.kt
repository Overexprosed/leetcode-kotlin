package leetcode.legostin.hash_table

class SubarraySumsDivisibleByK {

    fun subarraysDivByK(nums: IntArray, k: Int): Int {
        val prefixMap = mutableMapOf<Int, Int>()
        prefixMap[0] = 1

        var sum = 0
        var count = 0

        nums.forEach { num ->
            sum = (sum + num) % k
            if (sum < 0) sum += k

            if (prefixMap.containsKey(sum % k)) {
                count += prefixMap[sum] ?: 0
            }
            prefixMap[sum] = prefixMap.getOrDefault(sum, 0) + 1
        }

        return count
    }
}
