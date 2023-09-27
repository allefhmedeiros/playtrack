package br.com.alura.playtrack.modelo;

import br.com.alura.playtrack.interfaces.Reproducao;

public class Faixa {

    private int duracao;

    private String titulo;
    private int anolancamento;
    private boolean favorito;
    private int avaliacoes;

    public boolean isFavorito() {
        return favorito;
    }

    private int somaNota;

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(int anolancamento) {
        this.anolancamento = anolancamento;
    }

    public boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public int getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(int avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public int getSomaNota() {
        return somaNota;
    }

    public void setSomaNota(int somaNota) {
        this.somaNota = somaNota;
    }

    public void favoritaAFaixa(){
        if (this.favorito == true) {
            setFavorito(false);
        } else {
            setFavorito(true);
        }
    };

    @Override
    public String toString() {
        return "Faixa{" +
                "Duração: " + duracao +
                ", Ano de Lançamento: " + anolancamento +
                ", Playlist Favoritos? " + favorito +
                '}';
    }
}
