fun auditarEntregas(enderecos: List<String?>) {
    for (endereco in enderecos) {
        // Utiliza o Operador Elvis (?:) para substituir 'null' por "Endereço Desconhecido"
        val enderecoValido = endereco ?: "Endereço Desconhecido"

        // Verifica se o endereço é desconhecido ou válido
        if (enderecoValido == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoValido")
        }
    }
}

fun main() {
    // Lista de teste contendo endereços válidos e nulos
    val listaDeEnderecos: List<String?> = listOf(
        "Rua das Flores, 123",
        null,
        "Avenida Central, 456",
        null,
        "Praça da Sé, 789"
    )

    // Executa a função de auditoria
    auditarEntregas(listaDeEnderecos)
}