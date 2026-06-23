import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;

public class BancoDeDados {
    private Map<integer, Pessoa> database = new HashMap<>();
    public BancoDeDados() {}

    public Object newPessoa(int id, string Nome) {
        if (database.get(id) == null) {
            database.put(id, new Pessoa(id, nome));
        }
    }

    public Object deletePessoa(int id) {
        if (database.get(id) != null) {
            database.remove(id);
        }
    }

    public Object deleteAll() {
        database.clear();
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
