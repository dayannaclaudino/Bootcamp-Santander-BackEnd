/* 
 * Desafio
Imagine que você está desenvolvendo um aplicativo para um banco que deseja calcular os juros compostos 
de um investimento. Seu objetivo é criar uma função que receba três parâmetros: o valor inicial do 
investimento, a taxa de juros anual e o período de tempo em anos. A função deve calcular e retornar 
o valor final do investimento após o período determinado, levando em consideração os juros compostos.

Entrada:
A função deve receber os seguintes parâmetros:

valor_inicial: um número inteiro ou decimal representando o valor inicial do investimento.

taxa_juros: um número decimal representando a taxa de juros anual. Por exemplo, se a taxa for de 5%,
 o valor passado será 0.05.

periodo: um número inteiro representando a quantidade de anos do investimento.

Saída:
A função deve retornar o valor final do investimento após o período determinado, considerando os 
juros compostos. O valor final deve ser arredondado para duas casas decimais.

ENTRADA> 5000/0.08/5    SAÍDA: Valor final do investimento: R$ 7346.64 
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o VALOR INICIAL!");
        double valorInicial = scanner.nextDouble();
        System.out.println("Por favor, digite o Percentual de TAXA DE JUROS!"); 
        double taxaJuros = scanner.nextDouble()/100;
        System.out.println("Por favor, digite O PERÍODO EM ANOS!"); 
        int periodo = scanner.nextInt();
              
        double valorFinal = valorInicial;
     
        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

      
        for (int i = 1; i <= periodo; i++) {
            valorFinal = calcula(valorInicial, taxaJuros, periodo);
        // R$ %.2f",valorFinal);
         
        }
        System.out.printf("Valor final do investimento: R$ %.2f",valorFinal);
        scanner.close();
    
    }

    public static double calcula(double valorInicial, double taxaJuros, int periodo){
           return valorInicial * Math.pow(1.0 + taxaJuros, periodo);         
    }
}
