package leetcode.legostin.array

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        val hashMap = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val complement = target - nums[i]

            if (hashMap.containsKey(nums[i])) {
                result[0] = hashMap[nums[i]]!!
                result[1] = i
                return result
            }
            hashMap[complement] = i
        }
        return result
    }
}
