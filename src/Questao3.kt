fun validarBioInfantil(bio: String?) {
    // Utiliza Safe Call (?.) para acessar .length e o Operador Elvis (?:) para retornar 0 se 'bio' for null
    val tamanhoBio = bio?.length ?: 0

    // Condicional para verificar o limite de 50 caracteres
    if (tamanhoBio <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main() {
    // Teste 1: Bio curta e válida
    print("Teste 1: ")
    validarBioInfantil("Gosto de desenhos e videogames!") // Esperado: Bio aceita

    // Teste 2: Bio nula
    print("Teste 2: ")
    validarBioInfantil(null) // Esperado: Bio aceita (tamanho 0)

    // Teste 3: Bio com mais de 50 caracteres
    print("Teste 3: ")
    validarBioInfantil("Esta é uma biografia extremamente longa criada especificamente para passar do limite permitido de cinquenta caracteres.") // Esperado: Bio muito longa
}