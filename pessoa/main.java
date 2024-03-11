package pessoa;

public class main {

    public static void main(String[] args) {
        pessoa Gabriel = new pessoa("Gabriel","Oliveira");

        // Usando os getters para acessar os valores dos atributos
        System.out.println("Nome: " + Gabriel.getNome());
        System.out.println("Sobre Nome: " + Gabriel.getSobreNome());
        System.out.println("Idade: " + Gabriel.getIdade());
        System.out.println("Endereço: " + Gabriel.getEndereço());

        // Usando os setters para modificar os valores dos atributos
        Gabriel.setIdade(23);
        Gabriel.setEndereço("Terra");

        // Imprimindo os dados atualizados do livro
        Gabriel.imprimirDados();
    }
    
}
