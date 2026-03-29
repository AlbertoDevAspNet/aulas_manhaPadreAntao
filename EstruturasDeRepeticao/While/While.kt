// Program to compute the sum of natural numbers from 1 to 100.
fun main(args: Array<String>) {

    var soma = 0
    var i = 100

    while (i != 0) {
        soma += i     // sum = sum + i;
        --i
    }
    println("soma = $soma")
}