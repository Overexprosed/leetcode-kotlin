package leetcode.legostin.two_pointers

class ThreeSum {

    fun threeSum(nums: IntArray): List<List<Int>> {
        // сортируем массив, чтобы избежать дубликатов
        nums.sort()

        val result = mutableListOf<MutableList<Int>>()
        for (i in nums.indices) {
            // проверка дубликата
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue
            }

            // twoSum
            var pointer1 = i + 1
            var pointer2 = nums.size - 1

            while (pointer1 < pointer2) {
                val threeSum = nums[i] + nums[pointer1] + nums[pointer2]

                if (threeSum > 0) {
                    pointer2--
                } else if (threeSum < 0) {
                    pointer1++
                } else {
                    val innerList = mutableListOf<Int>()

                    innerList.add(nums[i])
                    innerList.add(nums[pointer1])
                    innerList.add(nums[pointer2])

                    result.add(innerList)

                    pointer1++
                    while (nums[pointer1] == nums[pointer1 - 1] && pointer1 < pointer2) {
                        pointer1++
                    }
                }
            }
        }
        return result
    }
}
