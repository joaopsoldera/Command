public class Pessoa {
    private int id;
    private string nome;

    public Pessoa(int id, string nome) {}

    //#region Getters e Setters
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public string getNome() {
        return this.nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }
    //#endregion
}
