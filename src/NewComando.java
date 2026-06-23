class NewComando implements Comando {
    private BancoDeDados db;

    public NewComando(BancoDeDados bd) {
        this.setDB(bd);
    }

    public Object executar(Pessoa arg) {
        int id = arg.getId();
        String nome = arg.getNome();
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