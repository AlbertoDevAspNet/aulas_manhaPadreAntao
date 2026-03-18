
fun main(args: Array<String>){


    /*Entrada de dados via Console  */

    // método readLine() para leitura de dados no teclado
    //System.out.println("Digite seu nome: ")
    //val nome = readLine()
    //System.out.println("Bem vindo(a): $nome")

    // Exemplo pratico 
    /* Crie um programa em que o usuario informe 
    nome,idade e apresente os dados depois de digitados
     */

     System.out.println("Informe o seu nome: ")
     val name = readLine()
     System.out.println("Digite sua idade: ")
     val idade = readLine()?.toInt()!!
     System.out.println("Nome: $name")
     System.out.println("Idade: $idade ")
}