
fun main(args: Array<String>) {
    println("Digite um numero:")
    var numero =readLine()?.toInt()!!
    when(numero){
        1-> System.out.println("Domingo")
        2-> System.out.println("Segunda")
        3-> System.out.println("Terca")
        4-> System.out.println("Quarta")
        5-> System.out.println("Quinta")
        6-> System.out.println("Sexta")
        7-> System.out.println("Sabado")
        else-> System.out.println("Dia Invalido")
    }
}