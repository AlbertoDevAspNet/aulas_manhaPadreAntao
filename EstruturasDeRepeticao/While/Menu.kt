import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var opcao: Int = 0

    do {
        println("\n--- MENU DE OPÇÕES ---")
        println("1. Saudar")
        println("2. Somar dois números")
        println("3. Sair")
        print("Escolha uma opção: ")

        // Verifica se a entrada é um número inteiro
        if (scanner.hasNextInt()) {
            opcao = scanner.nextInt()

            when (opcao) {
                1 -> println("\nOlá! Bem-vindo ao programa Kotlin.")
                2 -> {
                    print("Digite o primeiro número: ")
                    val num1 = scanner.nextDouble()
                    print("Digite o segundo número: ")
                    val num2 = scanner.nextDouble()
                    println("Resultado: ${num1 + num2}")
                }
                3 -> println("\nSaindo... Até mais!")
                else -> println("\nOpção inválida! Tente novamente.")
            }
        } else {
            println("\nEntrada inválida! Digite um número.")
            scanner.next() // Limpa a entrada incorreta
        }

    } while (opcao != 3)
}

