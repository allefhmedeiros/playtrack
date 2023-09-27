package br.com.alura.playtrack.modelo;

import br.com.alura.playtrack.interfaces.Reproducao;

public class Reproduzindo implements Reproducao {

    private Faixa faixaTocando;
    private boolean statusReproducao;
    private boolean faixaStatus;

    public Faixa getFaixaTocando() {
        return faixaTocando;
    }

    public void setFaixaTocando(Faixa faixaTocando) {
        this.faixaTocando = faixaTocando;
    }

    public boolean isStatusReproducao() {
        return statusReproducao;
    }

    public void setStatusReproducao(boolean statusReproducao) {
        this.statusReproducao = statusReproducao;
    }

    public boolean isFaixaStatus() {
        return faixaStatus;
    }

    public void setFaixaStatus(boolean faixaStatus) {
        this.faixaStatus = faixaStatus;
    }

    @Override
    public void tocaAgora() {
        if(isStatusReproducao()==true){
            setStatusReproducao(false);
        } else {
            setStatusReproducao(true);
        }
    }

    @Override
    public void pausaAgora() {
        if (isStatusReproducao() == true) {
            if (faixaStatus == true) {
                setFaixaStatus(false);
            } else {
                setFaixaStatus(true);
            }
        }
    }

    @Override
    public String toString() {
        return "{" +
                "Faixa: " + faixaTocando +
                ", Sendo Reproduzido? " + statusReproducao +
                ", Pausado? " + faixaStatus +
                '}';
    }
}
