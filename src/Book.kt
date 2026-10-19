class Book(val title: String, val author: String, val pages: Int) {
    fun describe(){
        println("$title, $author, $pages стр")
    }
}