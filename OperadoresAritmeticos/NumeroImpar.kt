 fun main(args: Array<String>) {
    
    /* Verificar se o numero é impar ou par */

    System.out.println("Digite um numero :")
    val num= readLine()?.toInt()!!

    if( num % 2 == 0){
        System.out.println("Numero digitado é par:  $num ")

    }
    else {
        System.out.println("Numero digitado é impar: $num ")

    }
}
