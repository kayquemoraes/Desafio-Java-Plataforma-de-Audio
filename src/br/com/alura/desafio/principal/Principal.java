package br.com.alura.desafio.principal;

import br.com.alura.desafio.modelos.AvaliaAudio;
import br.com.alura.desafio.modelos.Musica;
import br.com.alura.desafio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Yesterday");
        minhaMusica.setArtista("The Beatles");
        minhaMusica.setGenero("British Rock");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
            if  (i < 50) {
                minhaMusica.curtir();
            }
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
            if  (i < 1000) {
                meuPodcast.curtir();
            }
        }

        AvaliaAudio avalia = new AvaliaAudio();
        avalia.inclui(minhaMusica);
        avalia.inclui(meuPodcast);
    }
}
