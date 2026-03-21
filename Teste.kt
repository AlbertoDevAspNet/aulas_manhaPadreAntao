


fun main(){
print("Teste de numero: ")
val t = readLine()
println("Informe outra idade: ")
val idade = Int(readLine())
/* verificar idades */
if(idade == 0 && idade <13){
    print("Filmes Infantis: ")
}
else if(idade >12 && idade <19){
    print("Idade Maior de 18, filmes Adultos:")
}
else if(idade >18){
    print("Idade Maior de 18, filmes Adultos:")
}
else {
    print("Valor Incorreto : ")
}

}