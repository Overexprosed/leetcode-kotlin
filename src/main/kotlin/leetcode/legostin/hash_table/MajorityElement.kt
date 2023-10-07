package leetcode.legostin.hash_table

class MajorityElement {

    fun majorityElement(nums: IntArray): List<Int> {
        var hashMap = mutableMapOf<Int, Int>()

        nums.forEach { number ->
            val count = hashMap.getOrDefault(number, 0).inc()
            hashMap[number] = count

            if (hashMap.size == 3) {
                val newHashMap = mutableMapOf<Int, Int>()

                hashMap.forEach { (key, value) ->
                    if (value > 1) {
                        newHashMap[key] = value - 1
                    }
                }
                hashMap = newHashMap
            }
        }

        val result = mutableListOf<Int>()
        hashMap.keys.forEach { key ->
            if (nums.count { it == key } > nums.size / 3) {
                result.add(key)
            }
        }

        return result
    }
}
