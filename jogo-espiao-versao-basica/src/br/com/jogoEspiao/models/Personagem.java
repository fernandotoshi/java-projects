package br.com.jogoEspiao.models;

public class Personagem {

    private String nomePersonagem;

    public Personagem(String nomePersonagem) {
        setNomePersonagem(nomePersonagem);
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getNomePersonagem() {
        return this.nomePersonagem;
    }

}
