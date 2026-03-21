fun main(args: Array<String>) {
    
    System.out.println("Operador OR: ")
    System.out.println("Basta uma ser Verdade para o resultado ser Verdadeiro:")
    System.out.println("Digite um numero  maior que 10 :")
    val num= readLine()?.toInt()!!
    if(num > 10 || num < 10 ){
        System.out.println("Numero maior que 10 ou menor que 10: ")
        System.out.println("Valor digitado: $num")
    }
    else {
        System.out.println("Entrada incorreta : ")
        
    }

    //Tratamento de Erros try catch

   
    
}
