package br.com.alura.playtrack.modelo;

public class Musica extends Faixa{

    private String genero;
    private String artista;
    private String compositor;
    private String album;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "Gênero: '" + genero + '\'' +
                ", Artista: '" + artista + '\'' +
                ", Album: '" + album + '\'' +
                "} \n" + super.toString();
    }
}
