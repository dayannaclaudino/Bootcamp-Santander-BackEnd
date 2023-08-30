import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.next();

        System.out.println("Número da Conta: " + numero + "\n Número da agencia: " + agencia + "\n Nome do Cliente: "
                + nomeCliente + "\n Saldo: " + saldo);
        System.out.println("Olá " + nomeCliente + " ,obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }

}
