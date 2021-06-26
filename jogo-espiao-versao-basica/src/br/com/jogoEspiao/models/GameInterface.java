package br.com.jogoEspiao.models;

import java.util.ArrayList;
import java.util.Scanner;

public class GameInterface {
    public static void menuInterface() {
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::: 1. Registrar jogadores                 :::::");
        System.out.println("::::: 2. Jogar                               :::::");
        System.out.println("::::: 3. Configurações de jogo               :::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
    }

    public static void cadastroInterface(ArrayList<Jogador> listaJogadores) {
        if(listaJogadores.isEmpty()) {
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("::::: Jogador 1: ");
        } else {
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("::::: Jogadores registrados:                 :::::");
            listaJogadoresRegistradosInterface(listaJogadores);
            System.out.print("::::: Jogador " + (listaJogadores.size()+1) + ": ");
        }
    }

    public static void listaJogadoresRegistradosInterface(ArrayList<Jogador> listaJogadores) {
        for(int i = 0; i < listaJogadores.size(); i++) {
            System.out.println("::::: Jogador " + (i+1) + ": " + listaJogadores.get(i).getNome());
        }
    }

    public static void perguntaMaisRegistros(ArrayList<Jogador> listaJogadores) {
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::: 1. Registrar + jogadores               :::::");
        System.out.println("::::: 2. Jogar                               :::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::: Jogadores registrados até aqui:        :::::");
        listaJogadoresRegistradosInterface(listaJogadores);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
}
