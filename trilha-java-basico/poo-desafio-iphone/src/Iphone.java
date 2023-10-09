import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{


    @Override
    public void exibirPagina() {
        System.out.println("Página Exibida.");
    }

    @Override
    public void adicionarNovaAba() {
         System.out.println("Adicionando Nova Aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualiazando Página.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música.");
    }
    
    @Override
    public void pausar() {
        System.out.println("Pausando Música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo....");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciar Correio de Voz");
    }


    public static void main(String[] args) throws Exception {
        Iphone comportamentosIphone = new Iphone();

        comportamentosIphone.tocar();
        comportamentosIphone.pausar();
        comportamentosIphone.selecionarMusica();

        comportamentosIphone.ligar();
        comportamentosIphone.atender();
        comportamentosIphone.iniciarCorreioVoz();
        
        comportamentosIphone.exibirPagina();
        comportamentosIphone.adicionarNovaAba();
        comportamentosIphone.atualizarPagina();
    }
}
