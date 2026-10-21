class Greeter {
    lateinit var userName: String
        private set
    private var ready : Boolean = false

    fun init(name: String) {
        require(name.isNotBlank()) { "Имя пользователя не должно быть пустым или состоять только из пробелов" }
        userName = name.trim()

    }

    fun isReady(){
        check(userName.isNotBlank()){"Имя пользователя не задано"}
    }

    fun greet():String {
        isReady()
        return "Hello, ${userName}!"
    }
}