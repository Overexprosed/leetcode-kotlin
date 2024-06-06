package leetcode.legostin.greedy

import java.util.*

class HandOfStraights {

    fun isNStraightHand(hand: IntArray, groupSize: Int): Boolean {
        if (hand.size % groupSize != 0) return false

        val frequencyMap = TreeMap<Int, Int>()

        hand.forEach { card ->
            val count = frequencyMap.getOrDefault(card, 0)
            frequencyMap[card] = count + 1
        }

        while (frequencyMap.isNotEmpty()) {
            val first = frequencyMap.firstEntry()

            for (i in 1 until groupSize) {
                val next = first.key + i

                if (frequencyMap.containsKey(next)) {
                    val count = frequencyMap[next]!! - 1

                    if (count == 0) {
                        frequencyMap.remove(next)
                    } else {
                        frequencyMap[next] = count
                    }
                } else {
                    return false
                }
            }

            if (first.value == 1) {
                frequencyMap.remove(first.key)
            } else {
                frequencyMap[first.key] = first.value - 1
            }
        }

        return true
    }
}
