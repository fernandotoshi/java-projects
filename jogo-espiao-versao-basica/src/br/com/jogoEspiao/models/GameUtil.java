package br.com.jogoEspiao.models;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameUtil {
    public static Lugar pegaLugarAleatorio(BancoDeDados bd) {
        int random = (int)(Math.random() * 10) + 1;
        int numeroSorteado = 0;
        if (bd.getBancoDeDados().size() > random) {
            numeroSorteado = bd.getBancoDeDados().size() % random;
        } else {
            numeroSorteado = random % bd.getBancoDeDados().size();
        }
        Lugar lugarSorteado = bd.getBancoDeDados().get(numeroSorteado);

        return lugarSorteado;
    }

    public static ArrayList<Jogador> sorteiaJogadores(ArrayList<Jogador> listJogadores) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = listJogadores.size() - 1; i > 0; i--) {
            int index = rnd.nextInt(i+1);

            Jogador a = listJogadores.get(index);
            listJogadores.set(index, listJogadores.get(i));
            listJogadores.set(i, a);
        }
        return listJogadores;
    }

    public static ArrayList<Jogador> atribuiPersonagens(ArrayList<Jogador> listJogadores, ArrayList<Personagem> listPersonagens, int numEspioes) {
        listPersonagens = sorteiaPersonagem(listPersonagens);

        if (listPersonagens.size() > listJogadores.size()) {
            for (int i = 0; i < listJogadores.size() - numEspioes; i++) {
                listJogadores.get(i).setPersonagem(listPersonagens.get(i));
            }
            for (int i = listJogadores.size() - numEspioes; i < listJogadores.size(); i++) {
                listJogadores.get(i).setPersonagem(new Personagem("Espião"));
            }
        } else {

        }
        return listJogadores;
    }

    public static ArrayList<Personagem> sorteiaPersonagem(ArrayList<Personagem> listPersonagem) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = listPersonagem.size() - 1; i > 0; i--) {
            int index = rnd.nextInt(i+1);

            Personagem a = listPersonagem.get(index);
            listPersonagem.set(index, listPersonagem.get(i));
            listPersonagem.set(i, a);
        }
        return listPersonagem;
    }

    public static void limpaPromptComando() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
