import jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyles

fun main() {
    //1
    println("#1")
    print("Введите количество товара: ")
    val n = readln().toInt()
    val prices = IntArray(n)

    var sum = 0
    var maxPrice = 0
    var maxIndex = 0

    for (i in prices.indices) {
        print("Введите цену: ")
        val price = readln().toInt()
        prices[i] = price

        sum += price

        if (price > maxPrice) {
            maxPrice = price
            maxIndex = i
        }
    }

    for (i in prices.indices) {
        println("${i + 1}. ${prices[i]} ₽")
    }

    println("Итого: $sum ₽")
    println("Самая дорогая позиция: ${maxIndex + 1}. $maxPrice ₽")

    //2
    println("#2")
    val seats = BooleanArray(10)

    while (true) {
        for (i in seats.indices) {
            print(if (seats[i]) "[X] " else "[ ] ")
        }
        println()

        for (i in 1..10) {
            print(" ${i.toString().padStart(2, ' ')} ")
        }
        println()

        print("Введите номер места (1-10) или 0 для выхода: ")
        val number = readlnOrNull()?.toInt()

        if (number == null) {
            println("Нужно ввести целое число.")
            continue
        }

        if (number == 0) {
            break
        }

        if (number !in 1..10) {
            println("Такого места нет.")
            continue
        }

        if (seats[number - 1]) {
            println("Место $number уже занято.")
        } else {
            seats[number - 1] = true
            println("Вы заняли место $number")
        }

        val seatsCount = seats.count { it == true }
        println()
        println("Занято мест: $seatsCount")

        print("Свободные места: ")
        var freeSeats = false

        for (number in 1..10 step 2) {
            if (!seats[number - 1]) {
                print("$number ")
                freeSeats = true
            }
        }

        for (number in 2..10 step 2) {
            if (!seats[number - 1]) {
                print("$number ")
                freeSeats = true
            }
        }

        if (!freeSeats) {
            print("нет")
        }

        println()
    }

    //3
    println("#3")
    println("Введите ряд чисел через пробел: ")
    val numbers = readln().trim().split(" ").map { it.toInt() }.toIntArray()
    println("Введите k: ")
    val k = readln().toInt()

    if (k < 1 || k > numbers.size) {
        println("Некорректное значение k.")
        return
    }

    var sumMax = 0
    for(i in 0 until k) {
        sumMax += numbers[i]
    }

    var maxSum = sumMax
    var startIndex = 0

    for(i in k until numbers.size) {
        sumMax += numbers[i] - numbers[i - k]

        if(sumMax > maxSum) {
            maxSum = sumMax
            startIndex = i - k + 1
        }
    }

    println("Максимальная сумма: $maxSum")
    println("Стартовый индекс: $startIndex")

    for(i in 0 until numbers.size / 2) {
        val reverseIndex = numbers.size - i - 1
        val temp = numbers[i]
        numbers[i] = numbers[reverseIndex]
        numbers[reverseIndex] = temp
    }

    println("Перевернутый массив: ${numbers.joinToString(" ")}")
}