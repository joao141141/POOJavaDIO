package Escola;

public class Escola {

    public static void main(String[] args) {
        Aluno joao = new Aluno();
        joao.setNome("João");
        joao.setIdade(15);
        System.out.println("O aluno " + joao.getNome() + " tem " + joao.getIdade() + " anos.");
    }
}
