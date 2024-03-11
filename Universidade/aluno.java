package Universidade;
public class aluno {
    

    private String nome;
    private int idade;
    private String curso;

    public aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        
    }

    

    public String getCurso() {
        return curso;
    }



    public void setCurso(String curso) {
        this.curso = curso;
    }



    // Método para imprimir os dados do aluno
    public void imprimirDados() {
        System.out.println("Aluno:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
    }
}
