package br.com.alura.desafio.modelos;

public class AvaliaAudio {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() > 8) {
            System.out.println(audio.getTitulo() + " é considerado sucesso no momento!");
        } else {
            System.out.println(audio.getTitulo() + " é uma excelente opção para ser ouvido.");
        }
    }
}
