fun main (args: Array<String>){

    //Operadores Aritmeicos em Kotlin
    // soma + 
    // subtracao - 
    // Multiplicacao *
    // Divisao /
    // Resto da Divisao %
    System.out.println("Operadores Aritmeticos em Kotlin:")
    System.out.println("Digite um numero:")
    val a = readLine()?.toInt()!!
    System.out.println("Digite outro Numero :")
    val b = readLine()?.toInt()!!
    System.out.println("Soma igual a :${a+b}")
    System.out.println("A diferenca vale : ${a-b}")
    System.out.println("A multiplicacao sera: ${a*b}")
    System.out.println("A Divisao sera: ${a/b}")
    System.out.println("Digite outro numero:")
    val c= readLine()?.toInt()!!
    System.out.println("Resto da divisao igual a : ${a%c}")

    
}
