package leetcode.legostin.array

class GasStation {

    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        var gasTotal = 0
        var costTotal = 0
        for (i in gas.indices) {
            gasTotal += gas[i]
            costTotal += cost[i]
        }
        if (gasTotal < costTotal) {
            return -1
        }

        var start = 0
        var gasRemains = 0
        for (i in gas.indices) {
            gasRemains = gasRemains + gas[i] - cost[i]
            if (gasRemains < 0) {
                start = i + 1
                gasRemains = 0
            }
        }
        return start
    }
}
