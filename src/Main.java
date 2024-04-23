import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variáveis
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        String view = """
                    ********************
                    Usuário: %s
                    Conta: %i
                    Saldo: %.2f
                    ********************
                    
                    """;
        String menu = """
                Operações
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:
                """;

        //Métodos


        //Código
        while(opcao != 4){
            System.out.println(view);
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:

                break;
                case 2:

                break;
                case 3:

                break;
                case 4:

                break;
                default:

                break;
            }
        }
    }
}