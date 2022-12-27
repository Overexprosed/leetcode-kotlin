package leetcode.legostin.hash_table

import java.util.Hashtable

/**
 * Problem explanation
 *
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * ---
 * Traverse array only once, saving complement of the target value and current array element,
 * and check this complement for each further array elements.
 */
class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        if (nums.isEmpty()) return intArrayOf()

        val map = Hashtable<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]

            // есть ли разница от текущего элемента, если есть получаем индекс элемента, который покроет эту разницу
            if (map.containsKey(nums[i])) {
                val j = map[nums[i]]!!
                return intArrayOf(j, i)
            } else {
                // разница и ключ, по которому мы эту разницу можем получить
                map[complement] = i
            }
        }
        return intArrayOf()
    }
}
