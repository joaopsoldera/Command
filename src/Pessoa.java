public class Pessoa {
    private int id;
    private String nome;

    public Pessoa(int id, String nome) {}

    //#region Getters e Setters
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //#endregion
}
