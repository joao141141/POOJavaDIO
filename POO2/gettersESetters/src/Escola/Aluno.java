package Escola;

public class Aluno {

    private String nome;
    private int idade;

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
}
