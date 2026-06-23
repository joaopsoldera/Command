class DeleteAllComando implements Comando {
    private BancoDeDados db;

    public DeleteAllComando(BancoDeDados bd) {
        this.setDB(bd);
    }

    public Object executar(Pessoa arg) {
        return this.getDB().deleteAll();
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