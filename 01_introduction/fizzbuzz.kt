fun main(){
    (1..100).forEach{
        print("${fb(it)},");
    }
}

fun fb(i: Int): String{
    when{
        i % 15 == 0 -> return "fizzbuzz";
        i % 5  == 0 -> return "buzz";
        i % 3  == 0 -> return "fizz";
        else        -> return "$i";
    }
}


