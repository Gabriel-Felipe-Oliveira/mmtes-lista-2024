package pessoa;

public class pessoa {
    private String nome;
    private String sobreNome;
    private int idade ;
    private String endereço;

    public pessoa( String nome, String sobreNome){
        this.nome = nome;
        this.sobreNome = sobreNome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("SObreNome: " + sobreNome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereço);
    }





}
