
public class SistemaCadastro {

    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "123.456.789-0", "Rua 1, N° 1256");

        System.out.println("Seja bem vindo" + marcos.getNome() + "! " + "Seu CPF é: " + marcos.getCpf() + " e seu endereço é: " + marcos.getEndereco() + ", e seu endereço é: " + marcos.getEndereco() + ".");

    }
}
