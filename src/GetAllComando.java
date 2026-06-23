class GetAllComando implements Comando {
    private BancoDeDados db;

    public GetAllComando(BancoDeDados bd) {
        this.setDB(bd);
    }

    public Object executar(Pessoa arg) {
        return this.getDB().getAll();
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