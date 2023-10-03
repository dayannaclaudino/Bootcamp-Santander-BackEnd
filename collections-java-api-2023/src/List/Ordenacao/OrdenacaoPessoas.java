package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoPessoas {
    
    private List <Pessoa> listaPessoa;

    public OrdenacaoPessoas() {
        this.listaPessoa = new ArrayList<>();
    } 

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoa);
       // Como não passei nada ele ordena pelo comparable 
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoa);
        //Passando o Comparator para ordenar, Quando não passo nada ele ordena pelo comparable 
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    
    public static void main(String[] args){
        
        OrdenacaoPessoas lista = new OrdenacaoPessoas();

        lista.adicionarPessoa("Nome 1", 20, 1.56);
        lista.adicionarPessoa("Nome 2", 30, 1.80);
        lista.adicionarPessoa("Nome 3", 25, 1.70);
        lista.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println("ORDENA IDADE:"+ lista.ordenarPorIdade());
        System.out.println("ORDENA ALTURA:"+ lista.ordenarPorAltura());
        
    }
}
