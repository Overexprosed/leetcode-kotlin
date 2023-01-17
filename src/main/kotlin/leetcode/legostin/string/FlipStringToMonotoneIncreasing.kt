package leetcode.legostin.string

class FlipStringToMonotoneIncreasing {

    fun minFlipsMonoIncr(s: String): Int {
        var m = 0

        val chars = s.toCharArray()
        for (c in chars) {
            if (c == '0') {
                m++
            }
        }
        var answer = m
        for (c in chars) {
            if (c == '0') {
                answer = Math.min(answer, --m)
            } else {
                m++
            }
        }
        return answer
    }
}