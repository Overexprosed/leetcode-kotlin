package leetcode.legostin.array

class TopKFrequentElements {

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        if (nums.size < k) return intArrayOf()

        // Определить частоту каждого элемента
        val frequencyMap = HashMap<Int, Int>(nums.size)

        nums.forEach { number ->
            frequencyMap.getOrDefault(number, 0).let { frequency ->
                frequencyMap[number] = frequency + 1
            }
        }

        // Создать массив индекс которого будет частотой элемента, а массив по индексу значениями
        val arrayOfLists = arrayOfNulls<MutableList<Int>>(nums.size + 1)
        frequencyMap.forEach { (number, frequency) ->
            if (arrayOfLists[frequency] == null) {
                arrayOfLists[frequency] = mutableListOf(number)
            } else {
                arrayOfLists[frequency].apply { this!!.add(number) }
            }
        }

        // Достать k значений из массива с конца
        val result = mutableListOf<Int>()
        for (i in arrayOfLists.size - 1 downTo 0) {
            if (arrayOfLists[i] != null) {
                if (result.size < k) {
                    result.addAll(arrayOfLists[i]!!)
                } else {
                    break
                }
            }
        }
        return result.subList(0, k).toIntArray()
    }
}
