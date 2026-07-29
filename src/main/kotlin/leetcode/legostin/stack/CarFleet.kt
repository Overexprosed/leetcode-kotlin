package leetcode.legostin.stack

import java.util.Stack

class CarFleet {

    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val positionWithSpeed = position.zip(speed).sortedByDescending { it.first }
        val stack = Stack<Double>()

        for (i in positionWithSpeed.indices) {
            val positionVal = positionWithSpeed[i].first
            val speedVal = positionWithSpeed[i].second

            val time = (target.toDouble() - positionVal) / speedVal

            if (stack.isNotEmpty() && stack.peek() >= time) {
                continue
            } else {
                stack.add(time)
            }
        }

        return stack.size
    }
}
