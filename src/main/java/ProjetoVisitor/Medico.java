package ProjetoVisitor;

public class Medico implements Pessoa {

    private int crm;
    private String nome;
    private Especialidade especialidade;

    public Medico(int crm, String nome, Especialidade especialidade) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return this.especialidade.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMedico(this);
    }
}
