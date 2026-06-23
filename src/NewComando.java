class NewComando implements Comando {
    private BancoDeDados db;

    public NewComando(BancoDeDados bd) {
        this.setDB(bd);
    }

    public Object executar(int id, string nome) {
        return this.getDB().newPessoa(id, nome);
    }

    //#region Getters e Setters
    public void setDB(BancoDeDados bd) {
        this.db = bd;
    }

    public BancoDeDados getDB() {
        return this.db;
    }
    //#endregion
}