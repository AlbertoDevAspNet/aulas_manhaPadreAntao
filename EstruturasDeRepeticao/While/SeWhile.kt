fun main(args: Array<String>) {
    println("Teste Se While: ")
    var num = 4
    igualQuatro(num)
    while(igualQuatro(num) <10){
        println("Escreva :")
        println("Digite um numero : ")
        num = readLine()?.toInt()!!
    }

    
}

fun int igualQuatro(var y: Int){

    println("Informe um numero :")
    y = readLine()?.toInt()!!
    return y
}
