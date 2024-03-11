package livro;

public class main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 59.90, 1954);

    
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Preço: R$" + livro1.getPreco());
        System.out.println("Ano de Publicação: " + livro1.getAnoPublicacao());

        
        livro1.setTitulo("Harry Potter e a Pedra Filosofal");
        livro1.setPreco(39.99);

    
        livro1.imprimirDados();
    }
}
