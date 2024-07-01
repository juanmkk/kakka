import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


    public class alunos {
        Scanner scanner = new Scanner(System.in);
        Alunos alunos = new Alunos();


        void adicionarVarios(){
            List<String[]> lista = new ArrayList<>();
            alunos.connect();
            alunos.createTable();
            while(true) {
                String[] nome ={"", ""};
                System.out.println("digite nome completo pra realizar o cadastro");
                nome[0] = scanner.nextLine();
                String[] cpf ={"", ""};
                System.out.println("digite seu CPF(apenas numeros)");
                cpf[0] = scanner.nextLine();

                //saída do loop
                if (nome[0].equalsIgnoreCase("fim")) {
                    break;
                }
            }
            alunos.insertClient(lista);
            alunos.close();
        }
        void imprimirMenu(){
            System.out.println("Escolha uma opção:");
            System.out.println("1- Inserir nome e sobrenome");
            System.out.println("2- Mostrar CPF dos alunos");
            System.out.println("3- mostrar cadastro do aluno");
            System.out.println("4- Remover alunos");
            System.out.println("5- Sair");
        }
    }
}
