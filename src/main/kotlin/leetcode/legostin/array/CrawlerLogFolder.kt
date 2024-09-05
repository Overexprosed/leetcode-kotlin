package leetcode.legostin.array

class CrawlerLogFolder {

    fun minOperations(logs: Array<String>): Int {
        var steps = 0

        logs.forEach { log ->
            when {
                log == "./" -> { /* do nothing */ }

                log == "../" -> if (steps > 0) steps--

                log.endsWith("/") -> steps++
            }
        }

        return steps
    }
}
