package ProjetoVisitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirPaciente(Paciente paciente) {
        return "Paciente{" +
                "ID=" + paciente.getId() +
                ", Nome='" + paciente.getNome() + '\'' +
                ", Condição='" + paciente.getCondicao() + '\'' +
                '}';
    }

    @Override
    public String exibirMedico(Medico medico) {
        return "Médico{" +
                "CRM=" + medico.getCrm() +
                ", Nome='" + medico.getNome() + '\'' +
                ", Especialidade='" + medico.getEspecialidade() + '\'' +
                '}';
    }

    @Override
    public String exibirEnfermeiro(Enfermeiro enfermeiro) {
        return "Enfermeiro{" +
                "COREN=" + enfermeiro.getCoren() +
                ", Nome='" + enfermeiro.getNome() + '\'' +
                ", Salário=" + enfermeiro.getSalario() +
                '}';
    }
}
