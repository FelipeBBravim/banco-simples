import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    static Usuario usuario = new Usuario();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Variáveis
        int opcao = 0;
        String view = """
                    ********************
                    Usuário: %s
                    Conta: %s
                    Saldo: %.2f
                    ********************
                    """.formatted(usuario.nome, usuario.conta, usuario.valor);

        String menu = """
                Operações
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:
                """;

        //Código
        System.out.println(view);

        while(opcao != 4){
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    consultarSaldo();
                break;
                case 2:
                    receberValor();
                break;
                case 3:
                    transferirValor();
                break;
                case 4:

                break;
                default:
                    System.out.println("Favor escolher dentro de uma das opções acima.");
                break;
            }
        }
    }

    //Métodos
    private static void consultarSaldo() {
        System.out.println("Seu saldo é de: " + usuario.valor);
    }

    private static void receberValor() {
        System.out.println("Informe o valor a receber:");
        double valor = scanner.nextInt();
        usuario.valor += valor;
        System.out.println("Saldo atualizado: " + usuario.valor);
    }

    private static void transferirValor(){
        System.out.println("Informe valor a ser transferido:");
        double valor = scanner.nextInt();

        if(valor > usuario.valor){
            System.out.println("Não é possível transferir um valor maior que o saldo da conta");
        } else {
            usuario.valor -= valor;
            System.out.println("Saldo atualizado: " + usuario.valor);
        }
    }
}