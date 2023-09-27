import br.com.alura.playtrack.modelo.Musica;
import br.com.alura.playtrack.modelo.Podcast;
import br.com.alura.playtrack.modelo.Reproduzindo;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SistemaPrincipal {
    public static final String ANSI_RED_BLACKGROUD = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {

        int opcaoUsuario = 0;
        Scanner entradaUsuario = new Scanner(System.in);

        //INSTANCIA DE ASSISTENTE DE REPRODUÇÃO
        Reproduzindo novaReproducao = new Reproduzindo();

        Musica musica1 = new Musica();
        Musica musica2 = new Musica();
        Musica musica3 = new Musica();

        Podcast podcast1 = new Podcast();
        Podcast podcast2 = new Podcast();
        Podcast podcast3 = new Podcast();

        //INSTANCIAMENTO DE MÚSICAS E PODCASTS
        {

            //CADASTRO PRÉVIO DE MÚSICAS PARA TESTE DE USABILIDADE DE CLASES
            musica1.setTitulo("Controlo tudo");
            musica1.setArtista("Eula Cris");
            musica1.setCompositor("Pedro Fons");
            musica1.setAlbum("O poder da adoração");
            musica1.setAnolancamento(2023);
            musica1.setGenero("Gospel");
            musica1.setAvaliacoes(35);
            musica1.setSomaNota(400);
            musica1.setDuracao(3);
            musica1.setFavorito(true);

            musica2.setTitulo("Zaqueu");
            musica2.setArtista("Paulo Neto");
            musica2.setCompositor("Sabino Heitor");
            musica2.setAlbum("Sai do caminho!");
            musica2.setAnolancamento(2022);
            musica2.setGenero("Gospel");
            musica2.setAvaliacoes(25);
            musica2.setSomaNota(400);
            musica2.setDuracao(5);
            musica2.setFavorito(false);

            musica3.setTitulo("Chuva de Poder");
            musica3.setArtista("André & Felippe");
            musica3.setCompositor("André Luiz");
            musica3.setAlbum("Transformação!");
            musica3.setAnolancamento(2020);
            musica3.setGenero("Gospel");
            musica3.setAvaliacoes(55);
            musica3.setSomaNota(900);
            musica3.setDuracao(7);
            musica3.setFavorito(false);

            //CADASTRO PRÉVIO DE PODCAST PARA TESTE DE USABILIDADE DE CLASES
            podcast1.setAssunto("Viver com paciência");
            podcast1.setAutor("Pedro Amaral");
            podcast1.setTemaCentral("Psicologia");
            podcast1.setEditor("Carlos Dantas");
            podcast1.setAnolancamento(2022);
            podcast1.setAvaliacoes(20);
            podcast1.setDuracao(20);
            podcast1.setFavorito(false);
            podcast1.setSomaNota(200);

            podcast2.setAssunto("Desenvolvendo autoconfiança");
            podcast2.setAutor("Pedro Amaral");
            podcast3.setTemaCentral("Psicologia");
            podcast2.setEditor("Carlos Dantas");
            podcast2.setAnolancamento(2021);
            podcast2.setAvaliacoes(10);
            podcast2.setDuracao(15);
            podcast2.setFavorito(true);
            podcast2.setSomaNota(150);

            podcast3.setAssunto("Desenvolvendo liderança");
            podcast3.setAutor("Silmar Amaral");
            podcast3.setTemaCentral("Psicologia");
            podcast3.setEditor("Valeria Silvino");
            podcast3.setAnolancamento(2020);
            podcast3.setAvaliacoes(15);
            podcast3.setDuracao(30);
            podcast3.setFavorito(false);
            podcast3.setSomaNota(550);

        }
        while (opcaoUsuario != 9) {
            System.out.println("*** *** *** PLAY TRACK *** *** **");
            System.out.println("*********************************\n");
            System.out.println("Reproduzindo: ");
            System.out.println(ANSI_RED_BLACKGROUD + novaReproducao.toString() + ANSI_RESET);
            System.out.println("*********************************\n");
            System.out.println("1 - " + musica1.toString() + "\n---");
            System.out.println("2 - " + musica2.toString() + "\n---");
            System.out.println("3 - " + musica3.toString() + "\n---");
            System.out.println("4 - " + podcast1.toString() + "\n---");
            System.out.println("5 - " + podcast2.toString() + "\n---");
            System.out.println("6 - " + podcast3.toString() + "\n---");
            System.out.println("7 - " + "Pausar" + "\n---");
            System.out.println("8 - " + "Favoritar" + "\n---");
            System.out.println("9 - " + "Sair" + "\n---");
            System.out.println("Escolha uma música ou opção adicional: \n");
            opcaoUsuario = entradaUsuario.nextInt();
            switch (opcaoUsuario){
                case 1:
                    novaReproducao.setFaixaTocando(musica1);
                    novaReproducao.tocaAgora();
                    break;
                case 2:
                    novaReproducao.setFaixaTocando(musica2);
                    novaReproducao.tocaAgora();
                    break;
                case 3:
                    novaReproducao.setFaixaTocando(musica3);
                    novaReproducao.tocaAgora();
                    break;
                case 4:
                    novaReproducao.setFaixaTocando(podcast1);
                    novaReproducao.tocaAgora();
                    break;
                case 5:
                    novaReproducao.setFaixaTocando(podcast2);
                    novaReproducao.tocaAgora();
                    break;
                case 6:
                    novaReproducao.setFaixaTocando(podcast3);
                    novaReproducao.tocaAgora();
                    break;
                case 7:
                    novaReproducao.pausaAgora();
                    break;
                case 8:
                    novaReproducao.getFaixaTocando().favoritaAFaixa();
                    break;

            }
        }
        entradaUsuario.close();

    }
}