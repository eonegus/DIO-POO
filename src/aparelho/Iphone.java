package aparelho;
import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    
    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }
    
    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void proximaMusica() {
        System.out.println("Proxima musica");
    }
    
    @Override
    public void voltarMusica() {
        System.out.println("Voltando...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada");
        tocar();
    }


    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando...");
    }

    @Override
    public void deletarAba() {
        System.out.println("Aba deletada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina...");
    }

    @Override
    public void exibirPaginaInicial() {
        System.out.println("Exibindo pagina inicial...");
    }

    @Override
    public void favoritarPagina() {
        System.out.println("Pagina favoritada");
    }

    @Override
    public void irParaPagina() {
        System.out.println("Indo para pagina...");
    }

    @Override
    public void mudarAba() {
        System.out.println("Mudando aba...");
    }

    @Override
    public void proximaPagina() {
        System.out.println("Indo para próxima pagina...");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }
    
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

}