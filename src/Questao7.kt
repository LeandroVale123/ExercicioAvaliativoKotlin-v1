fun limparBancoDeDados(emails: List<String?>) {
    // Contador numérico de contas inválidas iniciando em 0
    var contasInvalidas = 0

    // Laço de repetição for pela lista de e-mails
    for (email in emails) {
        // Safe Call (email?.length) obtém o tamanho, e o Elvis Operator (?: 0)
        // faz com que se o email for null, o tamanho seja considerado 0
        val tamanhoEmail = email?.length ?: 0

        // Se o e-mail for nulo OU se estiver em branco (tamanho 0)
        if (email == null || tamanhoEmail == 0) {
            contasInvalidas++
            println("Aviso: Conta inválida encontrada ($email). Marcada para deleção.")
        } else {
            println("Conta válida: $email")
        }
    }

    // Ao fim do laço, mostra quantas contas precisam ser apagadas
    println("\nTotal de contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    // Lista de teste com e-mails válidos, em branco ("") e nulos (null)
    val listaEmails: List<String?> = listOf(
        "usuario1@email.com",
        "",
        null,
        "dev@empresa.com.br",
        "",
        "admin@suporte.org",
        null
    )

    // Executa a função de limpeza
    limparBancoDeDados(listaEmails)
}