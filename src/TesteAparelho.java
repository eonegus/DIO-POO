import aparelho.Iphone;
import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class TesteAparelho {
    public static void main(String[] args) {
        ReprodutorMusical  reprodutor = new Iphone();
        reprodutor.tocar();

        NavegadorInternet navegador = new Iphone();
        navegador.exibirPagina();

        AparelhoTelefonico telefone = new Iphone();
        telefone.ligar();
    }
}
