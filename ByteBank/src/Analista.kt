class Analista (gnome: String, gcpf: String, gsalario: Double): Funcionario(nome = gnome,cpf = gcpf, salario = gsalario) {

    override val bonificacao: Double
        get() {
            return super.bonificacao
        }



//    fun autentica(senha: Int){    }


}