package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.pacotes.MinhasPreferidas;
import br.com.alura.minhasmusicas.pacotes.Musica;
import br.com.alura.minhasmusicas.pacotes.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Recadin no Espelho");
        musica1.setArtista("Luisa Sonza");
        musica1.setAlbum("recadin no espelho");
        musica1.setGenero("Funk");

        for (int i = 0; i < 500; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curte();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Para Tudo");
        podcast1.setHost("Lorelay Fox");
        podcast1.setDescricao("Um podcast para falar sobre tudo.");

        for (int i = 0; i < 200; i++) {
            podcast1.reproduz();
        }

        for (int i = 0; i < 30; i++) {
            podcast1.curte();
        }

        MinhasPreferidas favoritas = new MinhasPreferidas();
        favoritas.inclui(podcast1);
        favoritas.inclui(musica1);

        System.out.println(musica1.getTitulo() + " é uma música do artista " + musica1.getArtista());
    }
}