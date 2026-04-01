fun main(args: Array<String>) {

    var soma: Int = 0
    var entrada: String

    do {
        print("Digite um Numero Inteiro: ")
        entrada = readLine()!!
        soma += entrada.toInt()

    } while (entrada != "0")

    println("soma = $soma")
}
