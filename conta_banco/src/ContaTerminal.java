import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = entrada.nextLine();
        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = entrada.nextLine();
        System.out.println("Por favor, digite o valor a ser depositado!");
        saldo = entrada.nextDouble();

        System.out.println(
                "Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
                ", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque."
        );
    }
}
