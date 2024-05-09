
public class Pessoa {

    private final String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    //
    public void setNome(String newNome) {
        this.endereco = endereco;
    }

    public void setEndereco(String newEndereco) {
        this.endereco = endereco;
    }

    public void setCpf(String newCpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getCpf() {
        return this.cpf;
    }
}
