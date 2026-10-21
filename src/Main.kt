fun main() {
    //1
    println("#1")
    val user = DisplayName();
    user.name = "Alice"
    println(user.name)
    user.name = "   "
    println(user.name)

    //2
    println()
    println("#2")
    val greeter = Greeter()
    greeter.init("    Alice   ")
    println(greeter.greet())
}