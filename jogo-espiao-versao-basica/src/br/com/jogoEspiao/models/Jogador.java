package br.com.jogoEspiao.models;

public class Jogador {
    private String nome;
    private Personagem personagem;

    public Jogador(String nome) {
        this.nome = nome;
        this.personagem = new Personagem("Não definido");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public Personagem getPersonagem() {
        return this.personagem;
    }
}
