fun main() {
    
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val cloudia = Person("Cloudia")
    val tom = Person("Tom")
    sophia likes cloudia
    sophia likes tom
    println(sophia.likedPeople.joinToString(separator = ","))
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person){
        likedPeople.add(other)
    }
    // オーバーライドする際は override 修飾子が必要
    override fun toString(): String = name
}