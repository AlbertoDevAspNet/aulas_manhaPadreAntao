
/*
   o programa irá pedir para usuario informar 
   nome,nota1,nota2.
   Ao final terá que informar se aluno está aprovado ou 
   Reprovado com o valor da média <6
   
   crie um programa para exibir media do aluno
 */

 fun main(args: Array<String>)
 { 
    val nome : String ?
    val av1: Double
    val av2: Double
    val media: Double   
    

    System.out.println("Qual seu nome :")
    nome = readLine()
    System.out.println("Digite valor da nota Avaliacao1:")
    av1 = readLine()?.toDouble()!!
    System.out.println("Digite valor da nota Avaliacao2:")
    av2 = readLine()?.toDouble()!!
    media = (av1 + av2)/2 

    if(media < 6 )
    {
         System.out.println("Reprovado media igual: $media")

    } else {

      System.out.println("Aprovado media igual a: $media")
    }
   
    
 }