fun calcularDesconto(valorProduto: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valorProduto - 10.0
        "PROMO20" -> valorProduto - 20.0
        else -> valorProduto // Trata tanto o valor null quanto qualquer cupom inválido
    }
}

fun main() {
    val valorProduto = 100.0

    // Teste 1: Cupom PROMO10
    val resultado1 = calcularDesconto(valorProduto, "PROMO10")
    println("Com PROMO10: R$ $resultado1") // Esperado: 90.0

    // Teste 2: Cupom PROMO20
    val resultado2 = calcularDesconto(valorProduto, "PROMO20")
    println("Com PROMO20: R$ $resultado2") // Esperado: 80.0

    // Teste 3: Cupom nulo (Null Safety)
    val resultado3 = calcularDesconto(valorProduto, null)
    println("Com cupom nulo: R$ $resultado3") // Esperado: 100.0

    // Teste 4: Cupom inválido
    val resultado4 = calcularDesconto(valorProduto, "INVALIDO")
    println("Com cupom inválido: R$ $resultado4") // Esperado: 100.0
}