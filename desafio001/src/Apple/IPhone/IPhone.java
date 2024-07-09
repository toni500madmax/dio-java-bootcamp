package Apple.IPhone;

import Apple.functionalities.Internet.AdicionarNovaAba;
import Apple.functionalities.Internet.AtualizarPagina;
import Apple.functionalities.Internet.ExibirPagina;
import Apple.functionalities.Musica.Pausar;
import Apple.functionalities.Musica.SelecionarMusica;
import Apple.functionalities.Musica.Tocar;
import Apple.functionalities.Telefone.Atender;
import Apple.functionalities.Telefone.IniciarCorreioDeVoz;
import Apple.functionalities.Telefone.Ligar;

public class IPhone implements AdicionarNovaAba, AtualizarPagina, ExibirPagina, Pausar, SelecionarMusica, Tocar,
        Atender, IniciarCorreioDeVoz, Ligar {
    public void addAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizar() {
        System.out.println("Atualizando página...");
    }

    public void exibir() {
        System.out.println("Exibir página...");
    }

    public void tocaMusica() {
        System.out.println("Tocando musica...");
    }

    public void selectMusic() {
        System.out.println("Selecionando música...");
    }

    public void pausa() {
        System.out.println("Pausando musica...");
    }

    public void ligando() {
        System.out.println("Fazendo ligação...");
    }

    public void iniciar() {
        System.out.println("Iniciar correio de voz...");
    }

    public void atender() {
        System.out.println("Atendendo ligação...");
    }
}
