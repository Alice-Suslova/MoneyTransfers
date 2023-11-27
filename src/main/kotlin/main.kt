package ru.netology

fun main() {

    val amount = 15
    val rate = 0.0075

    if (amount > 35) {
        var commission = amount * rate
        println("Комиссия за перевод составляет: " + commission + " рублей")
    } else {
        println("Сумма перевода должны быть больше 35 рублей")
    }
}

