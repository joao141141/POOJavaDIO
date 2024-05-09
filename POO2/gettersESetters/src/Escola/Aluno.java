package Escola;

public class Aluno {

    private String nome;
    private int idade;
    private String sexo;

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSexo(String newSexo) {
        this.sexo = newSexo;
    }

    public String getSexo() {
        return this.sexo;
    }
}
