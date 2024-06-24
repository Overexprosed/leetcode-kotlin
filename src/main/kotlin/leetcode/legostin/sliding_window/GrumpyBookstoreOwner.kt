package leetcode.legostin.sliding_window

class GrumpyBookstoreOwner {

    /**
     * Sliding window фиксированного размера minutes.
     *
     * Считаем максимальное кол-во покупателей внутри окна.
     * Это кол-во покупателей, которых мы спасем от ворчуна его воздержанием.
     *
     * К ним прибавляем кол-во покупателей когда продавец добрый.
     * Они не пересекутся с теми, что мы считали в рамках окна, т.к. они выпадут, т.к. продавец их обнуляет.
     */
    fun maxSatisfied(customers: IntArray, grumpy: IntArray, minutes: Int): Int {
        var unrealizedCustomers = 0

        // Считаем первое окно, с таким подходом его проще будет двигать
        for (i in 0 until minutes) {
            unrealizedCustomers += customers[i] * grumpy[i]
        }

        var maxUnrealizedCustomers = unrealizedCustomers

        // Считаем максимальное кол-во неудовлетворенных клиентов в рамках окна
        for (i in minutes until customers.size) {
            // Добавляем клиентов при переезде окна
            unrealizedCustomers += customers[i] * grumpy[i]
            // Убираем выпавших клиентов при переезде окна
            unrealizedCustomers -= customers[i - minutes] * grumpy[i - minutes]

            maxUnrealizedCustomers = maxUnrealizedCustomers.coerceAtLeast(unrealizedCustomers)
        }

        var totalCustomers = maxUnrealizedCustomers
        // Считаем кол-во удовлетворенных клиентов
        for (i in customers.indices) {
            totalCustomers += customers[i] * (1 - grumpy[i])
        }

        return totalCustomers
    }
}
