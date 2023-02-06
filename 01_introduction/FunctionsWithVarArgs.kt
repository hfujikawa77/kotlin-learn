// vararg を使うことで複数の可変引数を渡すことができる
fun main(){
    // 
    fun printAll(vararg messages: String){
        for(m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")

    fun printAllWithPrefix (vararg messages: String, prefix: String){
        for(m in messages) println(prefix + m)
    }
    // 名前付きパラメータと併用できる
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好", 
        prefix="Greeting:"
    )

    // *を使うことで
    fun log(vararg entries: String){
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}