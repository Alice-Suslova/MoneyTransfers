package ru.netology

fun main() {

    val amount = 150
    val rate = 0.0075

    if (amount > 0) {
        var commission = amount * rate
        if (commission >= 35) {
            println("Комиссия за перевод составляет: $commission рублей")
        } else {
            println("Комиссия за перевод составляет: 35 рублей")
        }

    } else {
        println("Сумма перевода должны быть больше 0 рублей! ")
    }
}

