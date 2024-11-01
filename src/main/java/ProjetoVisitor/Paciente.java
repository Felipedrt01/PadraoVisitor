package ProjetoVisitor;

public class Paciente implements Pessoa {

    private int id;
    private String nome;
    private String condicao;

    public Paciente(int id, String nome, String condicao) {
        this.id = id;
        this.nome = nome;
        this.condicao = condicao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCondicao() {
        return condicao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPaciente(this);
    }
}
