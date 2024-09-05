package leetcode.legostin.math

class WaterBottles {

    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var result = 0
        var fullBottles = numBottles
        var availableBottles = numBottles

        result += fullBottles
        while (availableBottles >= numExchange) {
            fullBottles = availableBottles / numExchange
            result += fullBottles

            availableBottles %= fullBottles * numExchange // кол-во которое не смогли использовать при заполнении
            availableBottles += fullBottles // осталось после того как полные бутылки будут опустошены
        }

        return result
    }
}
