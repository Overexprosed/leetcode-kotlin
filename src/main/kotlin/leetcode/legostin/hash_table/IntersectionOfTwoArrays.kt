package leetcode.legostin.hash_table

class IntersectionOfTwoArrays {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set = nums1.toMutableSet()
        val resultSet = mutableListOf<Int>()

        for (i in nums2.indices) {
            if (set.contains(nums2[i])) {
                set.remove(nums2[i])
                resultSet.add(nums2[i])
            }
        }
        return resultSet.toIntArray()
    }
}
