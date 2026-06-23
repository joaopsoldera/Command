class DeleteComando implements Comando {
    private BancoDeDados db;

    public DeleteComando(BancoDeDados bd) {
        this.setDB(bd);
    }

    public Object executar(Pessoa arg) {
        int id = arg.getId();
        return this.getDB().deletePessoa(id);
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