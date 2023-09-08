import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o saldo da Conta!");
        double saldoAtual = scanner.nextDouble();
        System.out.println("Por favor, digite o valor do desposito!");
        double valorDeposito = scanner.nextDouble();
        System.out.println("Por favor, digite o valor de retirada!");
        double valorRetirada = scanner.nextDouble();

    
       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
       if (saldoAtual < valorRetirada) {
            System.out.println("Saldo Insulficiente!");
       } else if (valorDeposito <= 0 && valorRetirada <= 0){
            System.out.println("Valor inválido!");
       }
        else {
             saldoAtual += valorDeposito;
             saldoAtual -= valorRetirada;
             
       }
     //TODO: Imprimir a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.printf("Saldo atualizado na conta: %.1f", saldoAtual);
            
    }
}
