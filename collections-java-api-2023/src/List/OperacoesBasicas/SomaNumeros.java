package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    List<Integer> listaNumeros = new ArrayList<Integer>();

    public SomaNumeros() {
        this.listaNumeros = new ArrayList();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numero : listaNumeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;

        for (int i : listaNumeros) {
            if (i > maior) {
                maior = i;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = listaNumeros.get(0);
        for (int i : listaNumeros) {
            if (i < menor) {
                menor = i;
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }

    public static void main(String[] args)  throws Exception {
        
        SomaNumeros lista = new SomaNumeros();

        lista.adicionarNumero(32);
        lista.adicionarNumero(39);
        lista.adicionarNumero(43);
        lista.adicionarNumero(97);
        lista.adicionarNumero(8);

        lista.exibirNumeros();

        System.out.println("SOMA:"+ lista.calcularSoma());
        System.out.println("MAIOR:"+ lista.encontrarMaiorNumero());
        System.out.println("MENOR:"+ lista.encontrarMenorNumero());
        
    }
}

