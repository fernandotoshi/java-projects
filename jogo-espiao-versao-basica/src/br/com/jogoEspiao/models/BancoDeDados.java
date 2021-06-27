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

        //Titanic
        String[] listPersonagem1 = new String[] {"Músico", "Leonardo DiCaprio", "Capitão", "Rose", "Lagosta que sobreviveu", "Vilão", "Iceberg", "Garçom", "Madame", "Gaivota", "Salva Vidas"};
        bancoDeDados.add(adicionaLugar("Titanic", convertStringPersonagem(listPersonagem1)));

        //Acampamento
        String[] listPersonagem2 = new String[] {"Monitor", "Árvore", "Bear Grills", "Urso Pardo", "Escoteiro", "Viajante", "Louco de doce", "Ex-militar", "Gringo", "Maconheiro"};
        bancoDeDados.add(adicionaLugar("Acampamento", convertStringPersonagem(listPersonagem2)));

        //Zoológico
        String[] listPersonagem3 = new String[] {"Criança chata", "Jacaré", "Cobra", "Rinoceronte", "Famoso", "Zelador", "Youtuber", "Tartaruga", "Hipopótamo", "Guia de Visita", "Dono do zoo"};
        bancoDeDados.add(adicionaLugar("Zoológico", convertStringPersonagem(listPersonagem3)));

        //Set de Filmagem
        String[] listPersonagem4 = new String[] {"Figurante", "Diretor", "Neymar", "Atriz", "Ator", "Músico", "Maquiadora", "Cameraman", "Figurinista"};
        bancoDeDados.add(adicionaLugar("Set de Filmagem", convertStringPersonagem(listPersonagem4)));

        //Faculdade
        String[] listPersonagem5 = new String[] {"Estudante", "Cozinheiro do RU", "Professor", "Técnico de laboratório", "Faxineira", "Aluno que vende docinhos", "Bibliotecário", "Estagiário do professor", "Bixo/Bixete"};
        bancoDeDados.add(adicionaLugar("Faculdade", convertStringPersonagem(listPersonagem5)));

        //Mercado
        String[] listPersonagem6 = new String[] {"Cliente furtando coisas", "Toguro", "Açougueiro", "Repositor", "Marombeiro", "Cliente", "Entregador", "Gerente", "Caixa"};
        bancoDeDados.add(adicionaLugar("Mercado", convertStringPersonagem(listPersonagem6)));

        //Egito
        String[] listPersonagem7 = new String[] {"Celebridade", "Faraó", "Celebridade", "Nerfetite (Noiva do Faraó)", "Guia de turismo", "Múmia", "Turista", "Miragem", "Camelo", "Sacerdote"};
        bancoDeDados.add(adicionaLugar("Egito", convertStringPersonagem(listPersonagem7)));

        //Praia
        String[] listPersonagem8 = new String[] {"Vendedor de sorvete", "Caiçara", "Toguro", "Banhista", "Tartaruga", "Criança Perdida", "Surfista", "Salva Vidas", "Tio do queijinho"};
        bancoDeDados.add(adicionaLugar("Praia", convertStringPersonagem(listPersonagem8)));

        //Louge Hookah
        String[] listPersonagem9 = new String[] {"Parça", "Caixa", "Recepcionista", "O cara do carvão", "Cliente", "Playboy", "Preparadora de rosh", "Lavador de vaso", "Funkeiro"};
        bancoDeDados.add(adicionaLugar("Louge Hookah", convertStringPersonagem(listPersonagem9)));

        //Salão de Beleza
        String[] listPersonagem10 = new String[] {"Faxineiro", "Madame", "Namorado aguardando", "Estagiária", "Estilista de cabelo", "Cabeleleira leila", "Cabelereiro", "Manicure", "Dona de salão"};
        bancoDeDados.add(adicionaLugar("Salão de Beleza", convertStringPersonagem(listPersonagem10)));

        //Petshop
        String[] listPersonagem11 = new String[] {"Veterinárip", "Dono de pet", "Furão", "Papagaio", "Hamister", "Adestrador", };
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

    public ArrayList<Personagem> convertStringPersonagem(String[] listaString){
        ArrayList<Personagem> lista = new ArrayList<Personagem>();
        for(int i = 0; i < listaString.length; i++) {
            lista.add(new Personagem(listaString[i]));
        }
        return lista;
    }
}
