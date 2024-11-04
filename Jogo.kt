fun main() {
    println("Bem-vindo ao Simulador de Animal de Estimação Virtual!")
    println("Digite o nome do seu animal de estimação:")
    val nomePet = readLine() ?: "Plumo"
    val pet = VirtualPet(nomePet)

    while (true) {
        println("\nEscolha uma ação:")
        println("1. Alimentar $nomePet")
        println("2. Brincar com $nomePet")
        println("3. Colocar $nomePet para descansar")
        println("4. Verificar o status de $nomePet")
        println("5. Ir ao banheiro")
        println("6. Limpar sujeira")
        println("7. Passar tempo")
        println("8. Sair")

        val escolha = readLine()?.toIntOrNull() ?: continue

        when (escolha) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> pet.descansar()
            4 -> pet.verificarStatus()
            5 -> pet.irAoBanheiro()
            6 -> pet.limparSujeira()
            7 -> {
                pet.passarTempo()
                if (pet.nivelDeFome >= 100) {
                    println("$nomePet morreu de fome. Você perdeu!")
                    return
                } else if (pet.nivelFelicidade <= 0) {
                    println("$nomePet está muito triste. Você perdeu!")
                    return
                } else if (pet.nivelDeCansaco >= 100) {
                    println("$nomePet está muito cansado. Você perdeu!")
                    return
                } else if (pet.idade >= 50) {
                    println("Parabéns! $nomePet chegou até os 50 anos. Você venceu!")
                    return
                }
            }
            8 -> {
                println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!")
                return
            }
            else -> println("Escolha inválida. Tente novamente.")
        }
    }
}
