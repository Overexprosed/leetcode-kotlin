package leetcode.legostin.array

class CountTheNumberOfFairPairs {

    fun countFairPairs(nums: IntArray, lower: Int, upper: Int): Long {
        nums.sort()

        val allToUpper = countLess(nums, upper) // all pairs to sum up to upper
        val lessThanLower = countLess(nums, lower - 1) // all pairs to sum up to lower

        return allToUpper - lessThanLower // all pairs between
    }

    private fun countLess(nums: IntArray, value: Int): Long {
        var result: Long = 0

        var pointer1 = 0
        var pointer2 = nums.size - 1

        while (pointer1 < pointer2) {
            while (pointer1 < pointer2 && nums[pointer1] + nums[pointer2] > value) {
                pointer2--
            }

            result += (pointer2 - pointer1).toLong()
            pointer1++
        }

        return result
    }
}
