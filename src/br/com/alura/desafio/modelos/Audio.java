package br.com.alura.desafio.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void reproduzir() {
        totalReproducoes++;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        curtidas++;
    }

    public double getClassificacao() {
        return classificacao;
    }

    
}
