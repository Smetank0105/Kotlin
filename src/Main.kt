import java.util.Locale.getDefault

fun main() {
    //1
    println(parseCountOrNull(readln()))

    //2
    val age = parseCountOrNull(readln())
    if (age == null) {
        println("Error")
        return
    } else if (age >= 18) {
        println("Взрослый билет")
    } else if (age > 0) {
        println("Детский билет")
    } else {
        println("Неверный возраст")
    }

    //3
    println(formatText("Test1"))
    println(formatText("Test2",separator = '+'))
    println(formatText("Test3", repeatCount = 3))
    println(formatText("Test4",uppercase = true, separator = '-'))
}

fun parseCountOrNull(text: String): Int? {
    return when (val temp = text.trim()) {
        "" -> null
        else -> temp.toIntOrNull()
    }
}

fun formatText(
    text: String,
    timeSpace: Boolean = true,
    uppercase: Boolean = false,
    repeatCount: Int = 1,
    separator: Char = ' '
): String {
    var result: String = text
    if (timeSpace) {
        result = text.trim()
    }
    if (uppercase) {
        result = result.uppercase(getDefault())
    }
    if(repeatCount > 1) {
        var temp:String = ""
        for (i in 1..repeatCount) {
            temp += result + separator
        }
        result = temp
    }
    return result
}