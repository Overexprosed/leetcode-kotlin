package leetcode.legostin.math

/**
 * Например, в массиве четыре 1.
 * Чтобы составить пару (2 слота), в первый можно поместить любую 1 - 4 варианта.
 * Во второй останется только 3.
 * 4 * 3 = 12
 * Но это перебор в любом направлении, чтобы было только в прямом делим на 2.
 * (4 * 3) / 2
 */
class NumberOfGoodPairs {

    fun numIdenticalPairs(nums: IntArray): Int {
        var result = 0
        val hashMap = mutableMapOf<Int, Int>()

        nums.forEach { number ->
            hashMap[number] = hashMap.getOrDefault(number, 0).inc()
        }

        hashMap.forEach { (_, value) ->
            result += (value * (value - 1)) / 2
        }

        return result
    }
}
