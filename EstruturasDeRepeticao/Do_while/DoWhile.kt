fun main(args: Array<String>) {
    // Estrutura Do While
    // Faça Enquanto ?
    var y = 3

    Do{
        
        println("Digite a idade: ")
        var idade = readLine()?.toInt()!!
        if(idade >=0 && idade < 18){
            println("Menor de idade: ")

        } else { println("no Else :")}
        //println(y) 
        

    }  While(idade < 17)
}
