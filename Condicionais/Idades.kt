fun main() {
    println("Digite sua idade:")
    val input = readLine()
    
    val idade = try {
        input?.toIntOrNull() ?: 0
    } catch (e: NumberFormatException) {
        println("Idade inválida!")
        return
    }
    
    val status = when (idade) {
        in 0..17 -> "Menor de idade"
        in 18..64 -> "Adulto"
        in 65..120 -> "Idoso"
        else -> "Idade inválida"
    }
    println("Status: $status (idade: $idade anos)")
}

