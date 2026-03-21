fun main(args: Array<String>) {
    System.out.println("Operadores Logicos: ")
    System.out.println("Digite um numero maior que 10 e menor que 20:")
    val num=readLine()?.toInt()!!

    if(num > 10 && num <20){
  System.out.println("Numero entre 10 e 20 : numero igual a: $num ")
    }
    else if(num < 10){

       System.out.println("Numero Menor que 10: numero igual a $num")
    }else {
        System.out.println("Numero Maior que 20: Numero igual a : $num")
    }
}
