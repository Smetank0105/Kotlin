fun main() {
    //1
    println("#1")
    val book1 = Book("Мастер и маргарита", "Михаил Булгаков", 480)
    val book2 = Book("Два капитана", "Вениамин Каверин", 638)
    val book3 = Book("1984", "Джордж Оруэлл", 320)

    book1.describe()
    book2.describe()
    book3.describe()

    //2
    println()
    println("#2")
    val owner = BankAccount("Anna")
    owner.deposit(1500)
    owner.printBalance()
    owner.withdraw(1000)
    owner.printBalance()
    owner.withdraw(1000)

    //3
    println()
    println("#3")
    val user1 = User(1, "Ivan", "Ivan@mail")
    val user2 = User(1, "Ivan", "Ivan@mail")

    println(user1 == user2)
    println(user1 === user2)
    println(user1)
    val user3 = user1.copy(email = "Maria@mail")
    println(user3)
    println("${user1.id}, ${user1.name}, ${user1.email}")

    //4
    println()
    println("#4")
    val products = listOf<Product>(
        Product("Carrot", 15, 10),
        Product("Tomato", 25, 20),
        Product("Banana", 35, 30),
    )

    var totalPrice = 0
    var maxPrice = 0
    var bestProduct: Product? = null
    for (product in products) {
        if(product.price > maxPrice) {
            maxPrice = product.price
            bestProduct = product
        }
        totalPrice += product.price * product.quantity
    }
    val product = bestProduct?.copy(quantity = (bestProduct.quantity) + 1)
    println(products)
    println(product)
}