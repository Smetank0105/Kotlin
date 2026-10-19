class BankAccount(val owner: String, var balance: Int = 0) {
    fun deposit(amount: Int) {
        if (amount >= 0) {
            balance += amount
        }
    }

    fun withdraw(amount: Int) {
        if (amount <= balance) {
            balance -= amount
        }else{
            println("Недостаточно средст")
        }
    }

    fun printBalance(){
        println("${owner}. Баланс: $balance руб.")
    }
}