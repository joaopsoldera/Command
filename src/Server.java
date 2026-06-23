import java.util.Map;
import java.util.HashMap;

public class Server {
    private BancoDeDados bd;
    private Map<String, Comando> comandos = new HashMap<String, Comando>();

    public Server() {
        initComandos();
    }

    private void initComandos() {
        comandos.put("new", new NewComando(bd));
        comandos.put("del", new DeleteComando(bd));
        comandos.put("get", new GetComando(bd));
        comandos.put("delall", new DeleteAllComando(bd));
        comandos.put("getall", new GetAllComando(bd));
    }

    public void servico(String comando, Pessoa arg) {
        Comando c = (Comando) comandos.get("comando");

        if (c == null) {
            System.out.println("O comando " + comando + " não existe.");
        }
        else {
            Object resultado = c.executar(arg);
        }
    }
}
