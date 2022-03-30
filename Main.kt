import com.sun.tools.javac.Main

fun If_Else (){
    println("------------IF_ELSE KOTLIN ")
    println("input your number below ")
    val Input1= readLine()!!.toInt()
    println("input your number below ")
    val Input2= readLine()!!.toInt()
    val Description  = "The Result is = "
    val Hasil_Akhir = if (Input2 < Input1){
        println("$Description A")
    }
        else {
        println("$Description B")
    }

}


fun When(){
    println("------------WHEN KOTLIN")
    println("------kalkulator------")
    println("input your number below ")
    val Input1= readLine()!!.toInt()
    println("input your number below ")
    val Input2 = readLine()!!.toInt()
    println("input your Operator below ")
    println("available operator for a moment + - *" )
    val Operator = readLine()
    val Hasil = when (Operator){
        "+" -> Input1 + Input2
        "-" -> Input1 - Input2
        "*" -> Input1 * Input2
        else -> When()
    }
    println("The result $Hasil")
}

fun While_Loop() {
    println("------------While Kotlin")

    var sum: Int = 0
    var input: String

    do {
        print("Enter an integer: ")
        input = readLine()!!
        sum += input.toInt()

    } while (input != "0")

    println("sum = $sum")
}

fun for_loop() {
    println("------------FOR LOOP KOTLIN ")
    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")

    for (item in language.indices) {

        // printing array elements having even index only
        if (item%2 == 0)
            println(language[item])
    }
}
fun  Break_kotlin (){
    println("------------BREAK KOTLIN")
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }
}

fun Continue_Kotlin() {
    println( "------------CONTINUE KOTLIN"  )
    var number: Int
    var sum = 0

    for (i in 1..6) {
        print("Enter an integer: ")
        number = readLine()!!.toInt()

        if (number <= 0)
            continue

        sum += number
    }
    println("sum = $sum")
}

fun main(){
    If_Else()
    When()
    for_loop()
    Break_kotlin()
    Continue_Kotlin()
}