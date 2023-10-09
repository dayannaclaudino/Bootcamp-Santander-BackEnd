/* Desafio
Você é um desenvolvedor em início de carreira e foi contratado por um banco para criar um 
sistema básico de abertura de contas. Sua tarefa é implementar uma classe chamada "ContaBancaria" 
que represente uma conta bancária com as seguintes informações: número da conta, nome do titular e saldo.

Entrada
O programa deve solicitar ao usuário as informações necessárias para abrir uma conta bancária. 
A entrada deve ser feita via console (linha de comando) e deve incluir o número da conta (um valor inteiro), 
o nome do titular (uma sequência de caracteres) e o saldo inicial da conta (um valor decimal).

Saída
Após receber as informações da conta, o programa deve criar um objeto do tipo "ContaBancaria" e 
exibir na tela as informações dessa conta, incluindo o número da conta, o nome do titular e o saldo atual. 
A saída deve ser formatada de forma clara e legível para o usuário.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
*/
import java.util.Scanner;

public class AbrindoContas {
    
    public static void main(String[] args) throws Exception {

    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, digite o Numero da Conta!");
    int numeroConta = scanner.nextInt();
    System.out.println("Por favor, digite o nomr do Titular!");
    String nomeTitular = scanner.next();
    System.out.println("Por favor, digite o saldo da Conta!");
    double saldo = scanner.nextDouble();

    //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
    ContaBancaria contaBancaria = new ContaBancaria();

    contaBancaria.setNumero(numeroConta);
    contaBancaria.setTitular(nomeTitular);
    contaBancaria.setSaldo(saldo);

    System.out.println("Informacoes:\n" + 
                        "Conta: " + contaBancaria.getNumero() + "\n" +
                        "Titular: " + contaBancaria.getTitular() +"\n" +
                        "Saldo: R$ " + contaBancaria.getSaldo()
                        );
    //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
  }


   static class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public void Bancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return  numero + titular + saldo;
    }

    
  }
}
