package br.com.alura.playtrack.modelo;

public class Podcast extends Faixa{
    private String autor;
    private String editor;
    private String assunto;
    private String temaCentral;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTemaCentral() {
        return temaCentral;
    }

    public void setTemaCentral(String temaCentral) {
        this.temaCentral = temaCentral;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "autor='" + autor + '\'' +
                ", editor='" + editor + '\'' +
                ", assunto='" + assunto + '\'' +
                ", temaCentral='" + temaCentral + '\'' +
                "} " + super.toString();
    }
}
