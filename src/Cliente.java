import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {
        BancoDeDados db = new BancoDeDados();
        Server server = new Server();
        Scanner sc = new Scanner(System.in);
        String comando = "";

        while(true) {
            System.out.println("new - Adiciona uma nova pessoa ao Banco de Dados\ndel - Deleta uma pessoa do Banco de Dados\nget - Pesquisa por uma pessoa no Banco de Dados\ndelall - Deleta todas as pessoas presentes no Banco de Dados\ngetall - Retorna todas as pessoas presentes no Banco de Dados\nexit - Encerra a Sessão\n:: ");
            comando = sc.nextLine();

            if (comando.equals("exit")) {
                break;
            }

            Pessoa arg = null;

            if (comando.equals("new")) {
                System.out.print("ID: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                arg = new Pessoa(id, nome);
            }

            if (comando.equals("del") || comando.equals("get")) {
                System.out.print("ID: ");
                int id = Integer.parseInt(sc.nextLine());

                arg = new Pessoa(id, null);
            }

            server.servico(comando, arg);
        }

        sc.close();
    }
}
