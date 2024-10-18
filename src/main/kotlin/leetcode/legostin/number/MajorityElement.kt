package leetcode.legostin.number

class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        if (nums.isEmpty()) return -1

        var majorityElement = 0
        var count = 0

        for (number in nums) {
            if (count == 0) {
                majorityElement = number
                count++
            }
            if (majorityElement == number) {
                count++
            } else {
                count--
            }
        }

        // verifying if found result is correct
        count = 0
        for (number in nums) {
            if (number == majorityElement) {
                count++
            }
        }

        return if (count > nums.size / 2) majorityElement else -1
    }
}
