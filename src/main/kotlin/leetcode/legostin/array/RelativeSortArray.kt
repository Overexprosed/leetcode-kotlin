package leetcode.legostin.array

import java.util.*

class RelativeSortArray {

    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val frequencyMap = mutableMapOf<Int, Int>()

        arr1.forEach { num ->
            val count = frequencyMap[num] ?: 0
            frequencyMap[num] = count + 1
        }

        val result = IntArray(arr1.size)
        val left = PriorityQueue<Int>()

        var index = 0

        arr2.forEach { num ->
            frequencyMap[num]?.let { count ->
                for (i in 0 until count) {
                    result[index] = num
                    index++
                }
                frequencyMap.remove(num)
            }
        }

        frequencyMap.forEach { (num, count) ->
            for (i in 0 until count) {
                left.add(num)
            }
        }

        while (left.isNotEmpty()) {
            result[index] = left.poll()
            index++
        }


        return result
    }
}
