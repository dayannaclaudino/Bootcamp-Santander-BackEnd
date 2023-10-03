package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List <Livro> listaLivro;
    
    public CatalogoLivros() {
        this.listaLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivro.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaLivro.isEmpty()){
            for (Livro l : listaLivro) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;       
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!listaLivro.isEmpty()){
            for (Livro l : listaLivro) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }   

    public Livro pesquisarPorTitulo(String titulo){
        Livro livrosPorTitulo = null;
        if(!listaLivro.isEmpty()){
            for (Livro l : listaLivro) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;       
    }

    public void mostrar(){
        System.out.println(listaLivro);
    }
 
    public static void main(String[] args) {

        CatalogoLivros listaLivroCat = new CatalogoLivros();

        //TESTES

        listaLivroCat.adicionarLivro("1 Aguas para elefantes", "camila", 2020);
        listaLivroCat.adicionarLivro("2 O lado bom", "rafa", 2013);
        listaLivroCat.adicionarLivro("3 tartarugas", "alice", 2018);
        listaLivroCat.adicionarLivro("4 O lado bom", "rafa", 2013);
        
        listaLivroCat.mostrar();

        System.out.println("Pesquisa por autor:");
        System.out.println(listaLivroCat.pesquisarPorAutor("rafa"));
        System.out.println("Pesquisa por Ano:");
        System.out.println(listaLivroCat.pesquisarPorIntervaloAnos(2000, 2019));
        System.out.println("Pesquisa livros por título e retorna o primeiro livro encontrado.:");
        System.out.println(listaLivroCat.pesquisarPorTitulo("2 O lado Bom"));
    }

}
