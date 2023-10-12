package leetcode.legostin.binary_search

@Suppress("DuplicatedCode")
class FindInMountainArray {

    fun findInMountainArray(target: Int, mountainArr: MountainArray): Int {
        var left = 0
        val length = mountainArr.length() - 1
        var right = length
        var peek = 0

        // find index of peak
        while (left < right) {
            val middle = left + ((right - left) / 2)
            if (mountainArr.get(middle) < mountainArr.get(middle + 1)) {
                peek = middle + 1
                left = peek
            } else {
                right = middle
            }
        }

        // find target in the left of peak
        left = 0
        right = peek
        while (left <= right) {
            val middle = left + ((right - left) / 2)
            if (target < mountainArr.get(middle)) {
                right = middle - 1
            } else if (target > mountainArr.get(middle)) {
                left = middle +  1
            } else {
                return middle
            }
        }

        // find target in the right of peak
        left = peek
        right = length
        while (left <= right) {
            val middle = left + ((right - left) / 2)
            if (target < mountainArr.get(middle)) {
                left = middle +  1
            } else if (target > mountainArr.get(middle)) {
                right = middle - 1
            } else {
                return middle
            }
        }

        return -1
    }

    interface MountainArray {
        fun get(index: Int): Int
        fun length(): Int
    }
}
