package br.com.alura.minhasmusicas.pacotes;

public class MinhasPreferidas {
    public void inclui (Audio audio){
        if (audio.getClassificacao() > 8) {
            System.out.println(audio.getTitulo() + " foi adicionado às suas favoritas!");
        } else {
            System.out.println(audio.getTitulo() + " é uma ótima opção para adicionar à sua lista de próximas execuções.");
        }
    }
}
