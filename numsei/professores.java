import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


    public class Professores {
        Scanner scanner = new Scanner(System.in);
        Professores professores = new Professores();

        void adicionarVarios(){
            List<String[]> lista = new ArrayList<>();
            Professores.connect();
            Professores.createTable();
                while(true) {
                String[] nome ={"", ""};
                System.out.println("digite o nome do professor");
                nome[0] = scanner.nextLine();
                String[] cpf ={"", ""};
                System.out.println("digite o seu cpf(apenas numeros)");
                cpf[0] = scanner.nextLine();
                //saída do loop
                if (nome[0].equalsIgnoreCase("fim")) {
                    break;
                }
            }
            professores.insertClient(lista);
            professores.close();
        }

        private static void createTable() {
        }

        private void insertClient(){

        }
        private void close() {
        }

        void limparBancoDeDados(){
            professores.connect();
            professores.deleteprof();
            professores.close();
        }
        private void connect(){

        }
        private void deleteprof() {
        }

        void imprimirMenu(){
            System.out.println("Escolha uma opção:");
            System.out.println("1- Inserir nome e sobrenome");
            System.out.println("2- Mostrar clientes maiores de idade");
            System.out.println("3- Sinalizar menores de idade");
            System.out.println("4- Remover menores de idade");
            System.out.println("5- Sair");
        }
    }

}
