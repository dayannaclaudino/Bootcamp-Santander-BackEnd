/*
 Descrição
Durante uma reunião de acionistas, alguns pontos importantes são discutidos e com isso surge a 
necessidade do envolvimento da equipe de desenvolvedores. Com isso, você foi designado para criar
 uma interface que permitirá aos acionistas de uma empresa acessarem informações relevantes sobre 
 as análises da organização bancária. Sua tarefa é implementar uma classe que representa essa interface 
 e que fornece um método para consultar as análises de desempenho e outros tipos dentro de um determinado período.

Requisitos:

A classe deve ter um método chamado obterAnalisesDesempenho que recebe como parâmetros uma data inicial e uma data final.

Entrada
As datas inicial e final, no formato "dd/mm/aaaa", representando o intervalo de tempo desejado para consulta.

Saída
Uma lista contendo as análises de desempenho financeiro realizadas dentro do período especificado.
 */

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;


public class ReuniaoAcionistas {

  public static void main(String[] args) throws ParseException {
    // Lê os dados de Entrada conforme descrito neste Desafio.
    Scanner scanner = new Scanner(System.in);

    System.out.println("DATA INICIAL");
    String dataInicial = scanner.next();
    System.out.println("DATA FINAL");
    String dataFinal = scanner.next();

    SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
    List < String > analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

    for (String analise: analises) {
      System.out.println(analise);
    }
  }
}

class SistemaAcionistas {
  public List < String > obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Date dataInicial = df.parse(dataInicialStr);
    Date dataFinal = df.parse(dataFinalStr);

    // Simula uma base da dados em uma lista de análises:
    List < Analise > analises = new ArrayList < > ();
    analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
    analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
    analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
    analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
    analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
    analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

   //TODO: Implemente o filtro das análises dentro do período especificado. Dica: Crie uma lista para armazenar as análises filtradas e use um loop for para filtrar as análises.
        List<String> analisesFiltradas = new ArrayList<>();
        for (Analise a : analises) {
            if (!a.data.before(dataInicial) && !a.data.after(dataFinal)) {
                analisesFiltradas.add(a.descricao);
            }
        }
   // TODO: Retorne a lista de análises filtradas.
        return analisesFiltradas;
  }

  class Analise {
        Date data;
        String descricao;

        public Analise(Date data, String descricao) {
        this.data = data;
        this.descricao = descricao;
        }

        public Date getData() {
            return data;
        }

        public void setData(Date data) {
            this.data = data;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        @Override
        public String toString() {
            return "" + data + "" + descricao + "";
        }

        
  }
}


