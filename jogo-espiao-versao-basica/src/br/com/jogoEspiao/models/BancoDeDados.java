package br.com.jogoEspiao.models;

import java.util.ArrayList;

public class BancoDeDados {

    private ArrayList<Lugar> bancoDeDados;

    public BancoDeDados() {
        bancoDeDados = new ArrayList<Lugar>();
        montaBanco();
    }

    //  Index   Lugar()         ArrayList<Personagem>()
    //  ID      Lugar           ListaPersonagem
    //  0       "Restaurante"   {"Monge"; "Faxineira"; "Segurança"}
    //  1       "Hospital"      {"Médico"; Enfermeiro"; "Bandido"}

    public void montaBanco() {
        ArrayList<Personagem> listPersonagem = new ArrayList<Personagem>();
        listPersonagem.add(new Personagem("Monge"));
        listPersonagem.add(new Personagem("Faxineira"));
        listPersonagem.add(new Personagem("Segurança"));
        listPersonagem.add(new Personagem("Cliente"));
        listPersonagem.add(new Personagem("Chapeiro"));
        listPersonagem.add(new Personagem("Gerente"));
        listPersonagem.add(new Personagem("Garçom"));
        listPersonagem.add(new Personagem("Rato"));
        listPersonagem.add(new Personagem("Cozinheiro"));
        listPersonagem.add(new Personagem("Criança"));
        listPersonagem.add(new Personagem("Raquin"));
        listPersonagem.add(new Personagem("Famoso"));
        bancoDeDados.add(adicionaLugar("Restaurante", listPersonagem));

        ArrayList<Personagem> listPersonagem2 = new ArrayList<Personagem>();
        listPersonagem2.add(new Personagem("Médico"));
        listPersonagem2.add(new Personagem("Enfermeiro"));
        listPersonagem2.add(new Personagem("Bandido"));
        listPersonagem2.add(new Personagem("Covid"));
        listPersonagem2.add(new Personagem("Recepcionista"));
        listPersonagem2.add(new Personagem("Segurança"));
        listPersonagem2.add(new Personagem("Cirurgião"));
        listPersonagem2.add(new Personagem("Faxineiro"));
        listPersonagem2.add(new Personagem("Enfermeira"));
        bancoDeDados.add(adicionaLugar("Hospital", listPersonagem2));

        ArrayList<Personagem> listPersonagem3 = new ArrayList<Personagem>();
        listPersonagem3.add(new Personagem("Traficante"));
        listPersonagem3.add(new Personagem("Trans"));
        listPersonagem3.add(new Personagem("Bi"));
        listPersonagem3.add(new Personagem("DJ"));
        listPersonagem3.add(new Personagem("Segurança"));
        listPersonagem3.add(new Personagem("Bebado"));
        listPersonagem3.add(new Personagem("Recepcionista"));
        listPersonagem3.add(new Personagem("Bilheteiro"));
        listPersonagem3.add(new Personagem("Famosa"));
        bancoDeDados.add(adicionaLugar("Balada Augusta", listPersonagem3));
    }

    public Lugar adicionaLugar(String nomeLugar, ArrayList<Personagem> listPersonagem) {
        Lugar lugarAdicionar = new Lugar(nomeLugar);
        lugarAdicionar.setListPersonagem(listPersonagem);
        return lugarAdicionar;
    }

    public ArrayList<Personagem> preenchePersonagens(String[] listString) {
        ArrayList<Personagem> listaPersonagem = new ArrayList<Personagem>();
        for(int i = 0; i < listString.length; i++) {
            listaPersonagem.add(new Personagem(listString[i]));
        }
        return listaPersonagem;
    }

    public ArrayList<Lugar> getBancoDeDados() {
        return this.bancoDeDados;
    }
}
