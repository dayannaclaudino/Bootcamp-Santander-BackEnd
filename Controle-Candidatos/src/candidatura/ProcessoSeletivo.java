package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * ProcessoSeletivo
 * Testando uso de debugging a partir de um breakpoint
 */
public class ProcessoSeletivo {

    public static void main(String[] args) {
        String [] candidatos  = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
         for (String candidato : candidatos) {
                entrandoEmContato(candidato);
             }

            
        //imprimirSelecionados();
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) 
                tentativasRealizadas++;
            else
            System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas<3);
        if (atendeu) 
            System.out.println("CONSEGUIMOS CONTATO COM "+ candidato + " NA "+ tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+ candidato + " NÚMERO MÁXIMO TENTATIVAS "+ tentativasRealizadas + " REALIZADAS");
    }   

    //Método auxilar: se o valor entre 1 e 3 for igual a 1 quer dizer que atendeu 
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }




    
        static void imprimirSelecionados() {
             String [] candidatos  = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
             System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

             for (int i = 0; i < candidatos.length; i++) {
                System.out.println("O candidato de nº "+ (i+1) + " é "+ candidatos[i]);
             }
             
             System.out.println("FORMA ABREVIADA do FOR");
             for (String candidato : candidatos) {
                System.out.println("O candidato selecionado foi: " + candidato);
             }

        }
        static void selecaoCandidatos(){
             String [] candidatos  = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

             int candidatosSelecionados = 0;
             int candidatoAtual = 0;
             double salarioBase = 2000.0;

             while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();    
                
                System.out.println("O candidato " + candidato + "Solicitou este valor de salário "+ salarioPretendido );

                if (salarioBase >= salarioPretendido) {
                    System.out.println("O candidato " + candidato + "Foi selecionado para a caga.");
                    candidatosSelecionados++;
                }
                candidatoAtual++;
        }
    }
   
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO OS DEMAIS CANDIDATOS");
        }
    }
}
