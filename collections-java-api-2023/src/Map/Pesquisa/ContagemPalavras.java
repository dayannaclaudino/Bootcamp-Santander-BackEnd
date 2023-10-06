package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	Map<String, Integer> contagemPalavras;
	
	public ContagemPalavras() {
		contagemPalavras = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		contagemPalavras.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		if(!contagemPalavras.isEmpty()) {
			contagemPalavras.remove(palavra);
		} else {
			throw new RuntimeException("O map está vazio.");
		}
	}
	
	public void exibirContagemPalavras() {
		System.out.println(contagemPalavras);
	}
	
	public String exibirPalavraMaisFrequente() {
		String palavraMaisFrequente = null;
		Integer maiorContagem = 0;
		if(!contagemPalavras.isEmpty()) {
			for(Map.Entry<String, Integer> entry: contagemPalavras.entrySet()) {
				if(entry.getValue() > maiorContagem) {
					maiorContagem = entry.getValue();
					palavraMaisFrequente = entry.getKey();
				}
			}
		}
		return palavraMaisFrequente;
	}
	
	public static void main(String[] args) {
		ContagemPalavras contagemPalavras = new ContagemPalavras();
		
		contagemPalavras.adicionarPalavra("JavaScript", 5);
		contagemPalavras.adicionarPalavra("HTML", 3);
		contagemPalavras.adicionarPalavra("CSS", 7);
		contagemPalavras.adicionarPalavra("Java", 2);
		
		System.out.println("Palavra mais frequente: " + contagemPalavras.exibirPalavraMaisFrequente());
	}
}
