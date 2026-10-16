fun main() {
    //1
    println("#1")
    val list = mutableListOf<String>()
    while (list.size < 3) {
        print("Введите имя: ")
        val name = readlnOrNull()?.trim()
        if (!name.isNullOrEmpty()) {
            list.add(name)
        } else {
            println("Некорректный ввод, попробуйте еще раз.")
        }
    }
    print("Введите имя для поиска: ")
    val find = readlnOrNull()?.trim()
    if (list.contains(find)) {
        println("FOUND")
    } else {
        println("NOT_FOUND")
    }

    //2
    println()
    println("#2")
    print("Введите число гостей: ")
    val count: Int = readln().toInt()
    val set = mutableSetOf<String>()
    for (index in 1..count) {
        val name = readlnOrNull()?.trim()
        if (!name.isNullOrEmpty()) {
            val result = set.add(name)
            if (result) {
                println("REGISTERED")
            } else {
                println("DUPLICATE")
            }
        }
    }
    println("TOTAL: ${set.size}")

    //3
    println()
    println("#3")
    val map = mutableMapOf<String, Int>(
        "apple" to 70,
        "banana" to 55,
        "orange" to 80
    )
    println("Введите название: ")
    val firstItemName = readlnOrNull()
    val secondItemName = readlnOrNull()
    val totalPrice: Int = (map[firstItemName] ?: 0) + (map[secondItemName] ?: 0)
    println("Total price: $totalPrice")
}