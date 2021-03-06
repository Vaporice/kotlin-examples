package lyambda

fun main(args: Array<String>){
    val m = { x : String -> println(x) }
    val n : (String) -> Unit = { x -> println(x) }
    val o : (String) -> Unit = { x : String -> println(x) }

    m("good morning")
    n("good morning")
    o("good morning")

    val pi = { -> 3.1416 }

    val isEven = { n: Int -> (n % 2) == 0 }

    val fact = { n: Int -> Int
        var result = 1
        for (i in 1..n)
            result *= i

        result
    }

    println("Значение числа Pi равно ${pi()}")

    for (i in 1..10) {
        println("Число $i ${if (isEven(i)) "четное" else "нечетное"} его факториал равен ${fact(i)}")
    }
}