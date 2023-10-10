/* Desafio
Após o sucesso no desenvolvimento do sistema básico de abertura de contas bancárias, o banco decidiu expandir
 seus serviços para oferecer diferentes tipos de contas. Agora, além das contas bancárias comuns, 
 eles também oferecem contas poupança. Sua tarefa é implementar a herança e o polimorfismo no sistema, 
 criando uma classe "ContaPoupanca" que herde da classe "ContaBancaria" anteriormente criada. 
 A classe "ContaPoupanca" deve adicionar um novo atributo, taxa de juros, além dos atributos herdados.

Dica: Utilize a herança para criar a classe "ContaPoupanca" que herde da classe "ContaBancaria"
 e adicione o atributo "taxaJuros". Implemente o método "exibirInformacoes()" na classe "ContaPoupanca" 
 para exibir as informações adicionais.

Entrada
O programa deve solicitar ao usuário as informações necessárias para abrir uma conta poupança. 
A entrada deve ser feita via console (linha de comando) e deve incluir o número da conta (um valor inteiro),
 o nome do titular (uma sequência de caracteres), o saldo inicial da conta (um valor decimal)
e a taxa de juros da conta poupança (um valor decimal).

Saída
Após receber as informações da conta poupança, o programa deve criar um objeto do tipo "ContaPoupanca"
 e exibir na tela as informações dessa conta, incluindo o número da conta, o nome do titular, 
 o saldo atual e a taxa de juros. A saída deve ser formatada de forma clara e legível para o usuário.
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class HerancaBancaria{
    
    public static void main(String[] args) throws Exception {

    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, digite o Numero da Conta!");
    int numeroConta = scanner.nextInt();
    System.out.println("Por favor, digite o nomr do Titular!");
    String nomeTitular = scanner.next();
    System.out.println("Por favor, digite o saldo da Conta!");
    double saldo = scanner.nextDouble();
    System.out.println("Por favor, digite a taxa de Juros!");
    double taxaJuros = scanner.nextDouble();

    ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, nomeTitular, saldo, taxaJuros);

    System.out.println("Conta Poupanca:");
    contaPoupanca.exibirInformacoes();
    
    }
  }


    class ContaBancaria {
        private int numero;
        private String titular;
        private double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
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

  class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;
  
    //costrutor
    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
      //TODO: Implementar adequadamente esta sobrecarga de construtores.
       super(numero, titular, saldo);
       this.taxaJuros = taxaJuros;
    }
    
    //getters e setters
    public double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    public void exibirInformacoes() {
      super.exibirInformacoes();
      //TODO: Complementar as informações com a taxa de juros.
      System.out.printf("Taxa de juros: %s%%", taxaJuros);
    }

  }


