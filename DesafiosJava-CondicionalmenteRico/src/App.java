import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        
    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    System.out.println("Por favor, digite o saldo da Conta!");
    int saldoTotal = scanner.nextInt();
    System.out.println("Por favor, digite o valor de SAQUE!");
    int valorSaque = scanner.nextInt();

    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    //realizar saque se saldoDisponivel => valorSaque
    //valorSaque - saldoDisponivel
    
    if(saldoTotal >= valorSaque){
      saldoTotal -= valorSaque;
      System.out.println("Saque realizado com sucesso! Novo saldo: " + saldoTotal);
    }
      else{
        System.out.println("Saldo insuficiente. Saque nao realizado!"  + saldoTotal);
      }
  }
    
}
