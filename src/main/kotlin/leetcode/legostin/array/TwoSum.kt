package leetcode.legostin.array

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        val hashMap = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            // nums[i] in HashMap is complement, it means we found a solution
            if (hashMap.containsKey(nums[i])) {
                result[0] = hashMap[nums[i]]!!
                result[1] = i
                return result
            }

            hashMap[target - nums[i]] = i
        }
        return result
    }
}
