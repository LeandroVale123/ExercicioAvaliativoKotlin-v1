fun main() {
    // Lista contendo os valores das transferências Pix (com possíveis valores nulos)
    val transacoes: List<Double?> = listOf(50.0, null, 120.5, null, 10.0)

    // Variável para acumular a soma das transações válidas
    var total = 0.0

    // Laço de repetição para percorrer a lista
    for (valor in transacoes) {
        // Verifica se a transação não é nula
        if (valor != null) {
            total += valor
        } else {
            println("Transação ignorada")
        }
    }

    // Imprime o valor total processado
    println("Valor total processado: R$ $total")
}