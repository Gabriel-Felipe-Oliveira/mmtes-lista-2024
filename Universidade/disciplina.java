package Universidade;
public class disciplina {

    private String nome;
    private int cargaHoraria;
    private int quatidadeAluno;

    public int getQuatidadeAluno() {
        return quatidadeAluno;
    }

    public void setQuatidadeAluno(int quatidadeAluno) {
        this.quatidadeAluno = quatidadeAluno;
    }

    public disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    // Método para imprimir os dados da disciplina
    public void imprimirDados() {
        System.out.println("Disciplina:");
        System.out.println("Nome: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("QUantidade de alunos por sala : " + quatidadeAluno);
    }
}


