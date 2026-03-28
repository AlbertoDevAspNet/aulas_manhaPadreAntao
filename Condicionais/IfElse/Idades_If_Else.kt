fun main(args: Array<String>) {
    println("Digite sua idade:")
    val entrada = readLine()

    val idade = try {
        entrada?.toIntOrNull() ?: 0
    } catch (e: NumberFormatException) {
        println("Idade inválida!")
        return
    }

    if(idade ==0 || idade <18){
       println("Menor de Idade:")
    }
    else if(idade >=18 && idade <65){
        println("Adulto :")
    }
    else if(idade >=65 && idade <121){
        println("Idoso:")

    }
    else {
            println("Idade Invalida :")
    }
}
