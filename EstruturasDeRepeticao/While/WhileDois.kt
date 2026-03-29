fun main(args: Array<String>) {
    var op: String

    op = "78"
    var numero : Int = 0
     println("Digite 1 para Vendas: ")
         println("Digite 3 para Financas: ")
        
         println("Digite 5 para Tecnologia: ")
        
         println("Digite 7 para Robotica: ")
         println("Ou digite 9 para sair :  ")

    While( op != "9"){
       
         var n = readLine()?.toInt()!!
         when(n){
            1-> System.out.println("Vendas")
            3-> System.out.println("Financas")
            5-> System.out.println("Tecnologia")
            7-> System.out.println("Robotica ")
            9-> System.out.println("Volte Sempre : Ate a proxima")
            else-> System.out.println("Opcao Invalida: ")
            op = n.toString()

         }
        

    }
}
