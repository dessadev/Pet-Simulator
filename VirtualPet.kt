class VirtualPet(val nome: String) {
    var nivelDeFome = 50
    var nivelFelicidade = 50
    var nivelDeCansaco = 0
    var idade = 0
    var vontadeDeIrAoBanheiro = 0
    var sujeira = 0

    fun alimentar() {
        nivelDeFome -= 10
        if (nivelDeFome < 0) nivelDeFome = 0
        println("$nome foi alimentado. O nível de fome agora é $nivelDeFome.")
        vontadeDeIrAoBanheiro += 5
    }

    fun brincar() {
        nivelFelicidade += 10
        nivelDeCansaco += 10
        sujeira += 5
        println("$nome está brincando e se divertindo, mas está ficando um pouco cansado.")
    }

    fun descansar() {
        nivelDeCansaco -= 30
        if (nivelDeCansaco < 0) nivelDeCansaco = 0
        println("$nome está descansando.")
    }

    fun irAoBanheiro() {
        if (vontadeDeIrAoBanheiro > 0) {
            vontadeDeIrAoBanheiro = 0
            println("$nome foi ao banheiro. A vontade de ir ao banheiro agora é $vontadeDeIrAoBanheiro.")
        } else {
            println("$nome não precisa ir ao banheiro.")
        }
    }

    fun limparSujeira() {
        if (sujeira > 0) {
            sujeira = 0
            println("$nome foi limpo. A sujeira agora é $sujeira.")
        } else {
            println("$nome está limpo. Não há sujeira.")
        }
    }

    fun verificarStatus() {
        println("Status atual de $nome:")
        println("Nível de fome: $nivelDeFome")
        println("Nível de felicidade: $nivelFelicidade")
        println("Nível de cansaço: $nivelDeCansaco")
        println("Idade: $idade anos")
        println("Vontade de ir ao banheiro: $vontadeDeIrAoBanheiro")
        println("Sujeira: $sujeira")
    }

    fun passarTempo() {
        nivelDeFome += 3
        nivelFelicidade -= 3
        nivelDeCansaco += 10
        idade += 1
        vontadeDeIrAoBanheiro += 5
        sujeira += 3
        if (nivelDeFome > 100) nivelDeFome = 100
        if (nivelFelicidade < 0) nivelFelicidade = 0
        if (nivelDeCansaco > 100) nivelDeCansaco = 100
        println("$nome está ficando mais faminto e sujo com o passar do tempo.")
        println("Nível de fome: $nivelDeFome, Vontade de ir ao banheiro: $vontadeDeIrAoBanheiro, Sujeira: $sujeira")
    }
}
