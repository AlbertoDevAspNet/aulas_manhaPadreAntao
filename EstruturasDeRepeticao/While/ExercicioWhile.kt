fun main(args: Array<String>) {
    println("Ola Mundo !!")
    var num = 4
    while(num < 10){
        println("Numero igual a : $num")
        //num++
        println(num)
        print("Digite um numero:")
        num = readLine()?.toInt()!!
    }
}
