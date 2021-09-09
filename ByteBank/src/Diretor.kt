class Diretor (gnome: String, gcpf: String, gsalario: Double, val senha: Int, val plr: Double): Funcionario(nome = gnome,cpf = gcpf, salario = gsalario) {

    override val bonificacao: Double
        get() {
            return (salario *0.3 ) + plr
        }



//    fun autentica(senha: Int){    }


}