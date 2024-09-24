package desafioDio.model;

import desafioDio.AparelhoTelefonico;
import desafioDio.Navegador;
import desafioDio.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
    private String modelo;
    private int capacidade;

    public Iphone(String modelo, int capacidade) {
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    @Override
    public void tocar(Musica musica) {
        System.out.println("Tocando: " + musica.getTitulo() + " por " + musica.getArtista());
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void parar() {
        System.out.println("Música parada.");
    }

    @Override
    public void fazerChamada(Contato contato) {
        System.out.println("Chamando " + contato.getNome() + " no número " + contato.getTelefone());
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para: " + url);
    }
}
