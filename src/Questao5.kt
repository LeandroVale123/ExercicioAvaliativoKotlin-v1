fun avaliarMotorista(nota: Int?) {
    // Utiliza o Operador Elvis (?:) para converter notas nulas em 0
    val notaFinal = nota ?: 0

    // Estrutura when para classificar a nota do motorista
    when (notaFinal) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
        else -> println("Nota inválida.") // Para notas fora do intervalo esperado (ex: números negativos ou maiores que 5)
    }
}

fun main() {
    // Teste 1: Nota 5
    print("Teste 1 (Nota 5): ")
    avaliarMotorista(5) // Esperado: Excelente corrida!

    // Teste 2: Nota 4
    print("Teste 2 (Nota 4): ")
    avaliarMotorista(4) // Esperado: Boa corrida.

    // Teste 3: Nota 2 (intervalo 1, 2, 3)
    print("Teste 3 (Nota 2): ")
    avaliarMotorista(2) // Esperado: Precisamos melhorar.

    // Teste 4: Nota nula (Null Safety)
    print("Teste 4 (Nota null): ")
    avaliarMotorista(null) // Esperado: Nenhuma avaliação fornecida.
}