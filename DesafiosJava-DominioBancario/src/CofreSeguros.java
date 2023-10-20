
/* Desafio
Descrição
Você foi contratado para desenvolver um sistema de cofres seguros. O objetivo é 
criar dois tipos de cofres: um Cofre Digital, que é aberto por senha, e um Cofre Físico, 
que é aberto por chave.

Entrada
O programa irá solicitar ao usuário que digite o tipo de cofre a ser criado: "digital" ou 
"físico". Se for escolhido o tipo "digital", o programa irá solicitar a senha e a 
confirmação de senha do cofre digital (ambas com apenas números). Caso seja escolhido 
o tipo "físico", não é necessário nenhuma outra entrada.

Saída
O programa irá exibir as informações do cofre criado. Para o Cofre Digital, será exibido o 
tipo e o método de abertura (senha). Para o Cofre Físico, será exibido apenas o tipo
 e o método de abertura (chave).
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class CofreSeguros {

  public static void main(String[] args) throws Exception {

    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o Tipo do Cofre!");
    String tipoCofre = scanner.next();

    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      System.out.println("Digite a senha do Cofre!");
      int senha = scanner.nextInt();

      CofreDigital cofreDigital = new CofreDigital(senha);
      System.out.println("Tipo: Cofre Digital");
      System.out.println("Metodo de abertura: Senha");
      int tentativaSenha = scanner.nextInt();

      if (cofreDigital.validarSenha(tentativaSenha)) {
        System.out.println("Cofre aberto!");
      } else {
        System.out.println("Senha incorreta!");

      }
    } else if (tipoCofre.equalsIgnoreCase("fisico")) {
      CofreFisico cofreFisico = new CofreFisico();
      System.out.println("Tipo: Cofre Fisico");
      System.out.println("Metodo de abertura: Chave");
    } else {
      System.out.println("Tipo de cofre inválido.");
    }

  }
}

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }

  public int getSenha() {
    return senha;
  }

  public void setSenha(int senha) {
    this.senha = senha;
  }

  @Override
  public String toString() {
    return "" + senha + "";
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }


}
