package leetcode.legostin.number

/**
 * Find the element which appears more than half times.
 *
 * ---
 * Boyer–Moore majority vote algorithm.
 * It's like boxing. Wins who beats more than others.
 * Of course if strength of hits are equals :)
 */
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
        return if (count > nums.size / 2) {
            majorityElement
        } else {
            -1
        }
    }
}
