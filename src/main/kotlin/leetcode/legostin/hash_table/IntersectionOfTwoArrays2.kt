package leetcode.legostin.hash_table

class IntersectionOfTwoArrays2 {

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableListOf<Int>()
        val countMap = mutableMapOf<Int, Int>()

        nums1.forEach { num ->
            val count = countMap.getOrDefault(num, 0) + 1
            countMap[num] = count
        }

        nums2.forEach { num ->
            countMap[num]?.let { count ->
                if (count != 0) {
                    result.add(num)
                    countMap[num] = count - 1
                }
            }
        }

        return result.toIntArray()
    }
}
