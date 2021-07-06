package br.com.jogoEspiao.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameUtil {
    // Observações sobre possíveis codificações futuras:
    // - Delegar toda responsabilidade do método main para Classes
    // - Tornar todos os métodos dessa classe não estáticos

    public static Lugar pegaLugarAleatorio(BancoDeDados bd) {

        Random rand = new Random();
        int numeroSorteado = rand.nextInt(bd.getListaLugares().size()); // Irá gerar números aleatórios de 0 até lista.size() - 1
        Lugar lugarSorteado = bd.getListaLugares().get(numeroSorteado);

        return lugarSorteado;
    }

    public static ArrayList<Jogador> atribuiPersonagens(ArrayList<Jogador> listJogadores, ArrayList<Personagem> listPersonagens, int numEspioes) {
        Collections.shuffle(listPersonagens); // Na classe Collections existem métodos para ordenação de lista
        int numeroIdealEspioes = calculaNumeroEspioes(listJogadores.size());
        if (listPersonagens.size() >= listJogadores.size()) {
            for (int i = 0; i < listJogadores.size() - numeroIdealEspioes; i++) {
                listJogadores.get(i).setPersonagem(listPersonagens.get(i));
            }
            for (int i = listJogadores.size() - numeroIdealEspioes; i < listJogadores.size(); i++) {
                listJogadores.get(i).setPersonagem(new Personagem("Espião"));
            }
        }
        else {
            ArrayList<Personagem> listaDobradaPersonagens = (ArrayList<Personagem>) listPersonagens.clone();
            for (int i = 0; i < listPersonagens.size(); i++){
                listaDobradaPersonagens.add((listPersonagens.get(i)));
            }
            for (int i = 0; i < listJogadores.size() - numeroIdealEspioes; i++) {
                listJogadores.get(i).setPersonagem(listaDobradaPersonagens.get(i));
            }
            for (int i = listJogadores.size() - numeroIdealEspioes; i < listJogadores.size(); i++) {
                listJogadores.get(i).setPersonagem(new Personagem("Espião"));
            }
        }
        return listJogadores;
    }

    public static void limpaPromptComando() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    /**
     * @author yutaka
     * @date
     */
    public static int calculaNumeroEspioes(int qtddJogadores){
        int numEspioes = (int)(Math.ceil(qtddJogadores * 0.33));
        return numEspioes;
    }
}
