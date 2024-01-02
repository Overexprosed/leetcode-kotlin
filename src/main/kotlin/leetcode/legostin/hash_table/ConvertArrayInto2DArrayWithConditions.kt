package leetcode.legostin.hash_table

/**
 * На входе массив чисел.
 * Собрать матрицу, каждый ряд которой содержит только уникальные цифры.
 * Таких рядов должно быть минимальное кол-во (с соблюдением правила выше).
 */
class ConvertArrayInto2DArrayWithConditions {

    /**
     * Считаем частоту для каждого элемента.
     * При этом запоминаем максимальную частоту - это минимальное кол-во рядов.
     * Собираем ряд матрицы, пробегаясь по всей counterMap.
     *
     * @param nums массив чисел.
     * @return матрица.
     */
    fun findMatrix(nums: IntArray): List<List<Int>> {
        val matrix = mutableListOf<MutableList<Int>>()
        val counterMap = HashMap<Int, Int>()

        var maxFrequency = 0
        nums.forEach { number ->
            val frequency = counterMap.getOrDefault(number, 0) + 1
            counterMap[number] = frequency
            maxFrequency = frequency.coerceAtLeast(maxFrequency)
        }

        for (i in 0 until maxFrequency) {
            val row = mutableListOf<Int>()
            counterMap.forEach { (number, frequency) ->
                if (frequency >= 1) {
                    row.add(number)
                    counterMap[number] = frequency - 1
                }
            }
            matrix.add(row)
        }
        return matrix
    }
}
