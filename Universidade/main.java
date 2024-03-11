
package Universidade;
public class main {

    public static void main(String[] args) {
        aluno Gabriel = new aluno("Gabriel",23);
        disciplina Disciplina = new disciplina("Ciencia da computação", 200);
        professor Professor = new professor("Diego", 50, "Ciencia da Computação");
        Universidade Universidade = new Universidade("Una", "Betim");
        
        Gabriel.setCurso("Ciencia da Computação");
        Disciplina.setQuatidadeAluno(1);

        
        Gabriel.imprimirDados();
        Disciplina.imprimirDados();
        Professor.imprimirDados();
        Universidade.imprimirDados();
    }
}
    
