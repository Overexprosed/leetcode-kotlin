package leetcode.legostin.binary_search

class PeakIndexInMountainArray {

    fun peakIndexInMountainArray(arr: IntArray): Int {
        var left = 0
        var right = arr.size - 1
        var peek = -1

        while (left < right) {
            val middle = left + ((right - left) / 2)
            if (arr[middle] < arr[middle + 1]) {
                peek = middle + 1
                left = peek
            } else {
                right = middle
            }
        }

        return peek
    }
}
