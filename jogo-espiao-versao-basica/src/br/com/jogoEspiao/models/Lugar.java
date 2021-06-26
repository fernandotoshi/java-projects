package br.com.jogoEspiao.models;

import java.util.ArrayList;
import java.util.List;

public class Lugar {
    private String nomeDoLugar;
    private ArrayList<Personagem> listPersonagem;

    public Lugar() {

    }

    public Lugar(String nomeLugar) {
        this.nomeDoLugar = nomeLugar;
        listPersonagem = new ArrayList<Personagem>();
    }

    public void setListPersonagem(ArrayList<Personagem> listPersonagem) {
        this.listPersonagem = listPersonagem;
    }

    public ArrayList<Personagem> getListPersonagem() {
        return this.listPersonagem;
    }

    public String getNomeDoLugar() {
        return nomeDoLugar;
    }

    public void imprimePersonagens() {
        for (int i = 0; i < this.listPersonagem.size(); i++) {
            System.out.println("Personagem " + (i+1) + ": " + this.listPersonagem.get(i).getNomePersonagem());
        }
    }

}
