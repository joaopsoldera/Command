class GetComando implements Comando {
    private BancoDeDados db;

    public GetComando(BancoDeDados bd) {
        this.setDB(bd);
    }

    public Object executar(int id) {
        return this.getDB().getPessoa(id);
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