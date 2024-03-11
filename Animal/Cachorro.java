package Animal;

public class Cachorro extends Animal {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(int id, String tipo, String habitat, String nome, String raca, int idade) {
        super(id, tipo, habitat);
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void Latir(){
        System.out.println("Cachorro late : AUauAU");
    }

    public void mostrarDados() {
        System.out.println("Dados do Cachorro:");
        System.out.println("ID: " + getId());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + getRaca());
        System.out.println("Idade: " + getIdade());
    }


}
