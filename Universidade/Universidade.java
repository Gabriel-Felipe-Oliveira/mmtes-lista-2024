package Universidade;
public class Universidade {
    

    private String nome;
    private String endereco;

    public Universidade(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Método para imprimir os dados da universidade
    public void imprimirDados() {
        System.out.println("Universidade:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
    }
}
