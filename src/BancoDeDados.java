import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;

public class BancoDeDados {
    private Map<integer, Pessoa> database = new HashMap<>();
    public BancoDeDados() {}

    public Object newPessoa(int id, string Nome) {
        if (database.get(id) == null) {
            Pessoa p = new Pessoa(id, nome);
            database.put(id, p);

            return p;
        }
        return null;  
    }

    public Object deletePessoa(int id) {
        Pessoa p = database.get(id);
        if (p != null) {
            database.remove(id);
        }

        return p;
    }

    public Object deleteAll() {
        database.clear();

        return "Banco de Dados limpo!";
    }

    public Object getPessoa(int id) {
        return database.get(id);
    }

    public Object getAll() {
        List<Pessoa> lista = new List<Pessoa>();

        for (Pessoa p : database.values()) {
            lista.add(p);
        }

        return lista;
    }
}
