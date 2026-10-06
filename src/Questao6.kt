fun main() {
    // Variável armazenando a função Lambda
    // Recebe um Double? e retorna um Double
    val calcularGorjeta: (Double?) -> Double = {
        // 'it' refere-se ao parâmetro de entrada (Double?)
        if (it == null || it < 0.0) {
            0.0
        } else {
            it
        }
    }

    // Teste 1: Gorjeta válida (R$ 15.0)
    val gorjeta1 = calcularGorjeta(15.0)
    println("Gorjeta de R$ 15.0 -> R$ $gorjeta1") // Esperado: 15.0

    // Teste 2: Gorjeta nula (Null Safety)
    val gorjeta2 = calcularGorjeta(null)
    println("Gorjeta null -> R$ $gorjeta2") // Esperado: 0.0

    // Teste 3: Gorjeta com valor negativo (-5.0)
    val gorjeta3 = calcularGorjeta(-5.0)
    println("Gorjeta de R$ -5.0 -> R$ $gorjeta3") // Esperado: 0.0

    // Teste 4: Gorjeta zerada (0.0)
    val gorjeta4 = calcularGorjeta(0.0)
    println("Gorjeta de R$ 0.0 -> R$ $gorjeta4") // Esperado: 0.0
}