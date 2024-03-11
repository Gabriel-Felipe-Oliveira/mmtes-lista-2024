package Universidade;
public class professor {
    

    private String nome;
    private int idade;
    private String disciplina;

    public professor(String nome, int idade, String disciplina) {
        this.nome = nome;
        this.idade = idade;
        this.disciplina = disciplina;
    }

    // Método para imprimir os dados do professor
    public void imprimirDados() {
        System.out.println("Professor:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Disciplina: " + disciplina);
    }
}
