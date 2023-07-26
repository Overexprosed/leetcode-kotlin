package leetcode.legostin.array

/**
 * Дан массив, в ответе массив.
 * Каждый элемент в выходном массиве это умноженные друг на друга элементы входного массива,
 * за исключением i-го.
 */
class ProductOfArrayExceptSelf {

    /**
     * Чтобы достичь такого, достаточно взять число всех умноженных элементов
     * и поделить на i-ый. Но если он 0, не получится.
     *
     * Поэтому, вместо того чтобы делить, будем умножать.
     * Все умноженные элемента слева, умножаем на все умноженные элементы справа от i.
     */
    fun productExceptSelf(nums: IntArray): IntArray {
        // Получаем все умноженные элементы от i-го слева
        val prefixArray = IntArray(nums.size)
        // 1 - все умноженные элементы справа от i
        prefixArray[0] = 1
        for (i in 1 until nums.size) {
            prefixArray[i] = prefixArray[i - 1] * nums[i - 1]
        }

        // Получаем все умноженные элементы от i-го справа
        val suffixArray = IntArray(nums.size)
        suffixArray[nums.size - 1] = 1
        for (i in nums.size - 2 downTo  0) {
            suffixArray[i] = suffixArray[i + 1] * nums[i + 1]
        }

        // Т.к. массивы получены без учета i-го, это то что нам нужно
        val result = IntArray(nums.size)
        for (i in result.indices) {
            result[i] = prefixArray[i] * suffixArray[i]
        }

        return result
    }

    /**
     * Результат строим на ходу, чтобы уменьшить память.
     *
     * В первом вариант i результирующего массива строится:
     * result[i] = prefixArray[i] * suffixArray[i]
     *
     * Мы можем повторить построение префикса сразу в результирующий массив.
     * И на нем же повторить построение суффикса.
     */
    fun productExceptSelf2(nums: IntArray): IntArray {
        val result = IntArray(nums.size) { 1 }

        // Повторяем построение префикса
        var current = 1
        for (i in 1 until nums.size) {
            current *= nums[i - 1]
            result[i] = current
        }

        // Повторяем построение суффикса
        current = 1
        for (i in nums.size - 1 downTo 0) {
            result[i] *= current
            // записывание в current равносильно записыванию в отдельный массив
            current *= nums[i]
        }

        return result
    }
}
