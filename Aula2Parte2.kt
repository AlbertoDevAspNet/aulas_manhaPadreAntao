
fun main() {
    println("Informe sua idade: ")
    val idade = readLine()?.toIntOrNull() ?: 0
    
    val recomendacao = when {
        idade == 0 || idade < 13 -> "Filmes infantis recomendados:\n" +
                                   "• Frozen 2\n" +
                                   "• Moana\n" +
                                   "• Toy Story 4"
        
        idade in 13..17 -> "Filmes adolescentes recomendados:\n" +
                          "• Spider-Man: No Way Home\n" +
                          "• Stranger Things (série)\n" +
                          "• Euphoria (série)"
        
        idade >= 18 -> "Filmes adultos recomendados:\n" +
                      "• Oppenheimer\n" +
                      "• Dune: Part Two\n" +
                      "• The Godfather"
        
        else -> "Idade inválida. Por favor, informe uma idade válida."
    }
    
    println("\n--- RECOMENDAÇÃO ---")
    println(recomendacao)
}
/*  Em Swift fica dessa maneira 
import Foundation

print("Informe sua idade: ")
if let input = readLine(), 
   let idade = Int(input) {
    
    let recomendacao: String
    switch idade {
    case 0..<13:
        recomendacao = """
        Filmes infantis recomendados:
        • Frozen 2
        • Moana
        • Toy Story 4
        """
    case 13...17:
        recomendacao = """
        Filmes adolescentes recomendados:
        • Spider-Man: No Way Home
        • Stranger Things (série)
        • Euphoria (série)
        """
    case 18...Int.max:
        recomendacao = """
        Filmes adultos recomendados:
        • Oppenheimer
        • Dune: Part Two
        • The Godfather
        """
    default:
        recomendacao = "Idade inválida. Por favor, informe uma idade válida."
    }
    
    print("\n--- RECOMENDAÇÃO ---")
    print(recomendacao)
} else {
    print("Idade inválida.")
}


 */