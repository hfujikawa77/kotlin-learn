// operator fun Int.times(str: String) = str.repeat(this) // 1
// println(2 * "Bye ") // 2

fun main(){
    // .times は * と解釈される
    operator fun Int.times(str: String) = str.repeat(this)       // 1
    println(2 * "Bye ")                                          // 2

    // get は インデックス付きアクセス演算子 として解釈される
    // https://kotlinlang.org/docs/operator-overloading.html#indexed-access-operator
    operator fun String.get(range: IntRange) = substring(range) // 3
    val str = "Always forgive your enemies;"                    // 4
    println(str[0..14])

}