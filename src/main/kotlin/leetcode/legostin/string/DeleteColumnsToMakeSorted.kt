package leetcode.legostin.string

class DeleteColumnsToMakeSorted {

    fun minDeletionSize(strs: Array<String>): Int {
        if (strs.isEmpty()) return 0

        var delete = 0
        val rows = strs.size
        val columns = strs[0].length
        for (c in 0 until columns) {
            for (r in 0 until rows - 1) {
                if (strs[r][c].compareTo(strs[r + 1][c]) == 1) {
                    delete++
                    break
                }
            }
        }
        return delete
    }
}
