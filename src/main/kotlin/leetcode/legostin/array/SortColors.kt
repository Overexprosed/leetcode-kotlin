package leetcode.legostin.array

class SortColors {

    fun sortColors(nums: IntArray) {
        val buckets = IntArray(3) // индекс число, значение count

        nums.forEach { num ->
            buckets[num] += 1
        }

        var index = 0
        buckets.forEach { count ->
            for (i in 0 until count) {
                nums[index]
            }
        }

        for (i in buckets.indices) {
            buckets[i].let { count ->
                for (g in 0 until count) {
                    nums[index] = i
                    index++
                }
            }
        }
    }
}
