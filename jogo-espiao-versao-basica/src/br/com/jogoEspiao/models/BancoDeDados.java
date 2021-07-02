package br.com.jogoEspiao.models;

import java.util.ArrayList;

public class BancoDeDados {

    private ArrayList<Lugar> listaLugares;

    public BancoDeDados() {
        listaLugares = new ArrayList<Lugar>();
        montaBanco();
    }

    //  Index   Lugar()         ArrayList<Personagem>()
    //  ID      Lugar           ListaPersonagem
    //  0       "Restaurante"   {"Monge"; "Faxineira"; "Segurança"}
    //  1       "Hospital"      {"Médico"; Enfermeiro"; "Bandido"; "Gari"}
    //  x...

    // Observação: Ter duas opções, para jogar com arquivo ou sem: com banco de dados em arquivo csv usando Scanner(new File(".csv")) scanner.close()

    public void montaBanco() {

        //Titanic
        String[] listPersonagem1 = new String[] {"Músico", "Leonardo DiCaprio", "Capitão", "Rose", "Lagosta que sobreviveu", "Vilão", "Iceberg", "Garçom", "Madame", "Gaivota", "Salva Vidas"};
        listaLugares.add(adicionaLugar("Titanic", convertStringPersonagem(listPersonagem1)));

        //Acampamento
        String[] listPersonagem2 = new String[] {"Monitor", "Árvore", "Bear Grills", "Urso Pardo", "Escoteiro", "Viajante", "Louco de doce", "Ex-militar", "Gringo", "Maconheiro"};
        listaLugares.add(adicionaLugar("Acampamento", convertStringPersonagem(listPersonagem2)));

        //Zoológico
        String[] listPersonagem3 = new String[] {"Criança chata", "Jacaré", "Cobra", "Rinoceronte", "Famoso", "Zelador", "Youtuber", "Tartaruga", "Hipopótamo", "Guia de Visita", "Dono do zoo"};
        listaLugares.add(adicionaLugar("Zoológico", convertStringPersonagem(listPersonagem3)));

        //Set de Filmagem
        String[] listPersonagem4 = new String[] {"Figurante", "Diretor", "Neymar", "Atriz", "Ator", "Músico", "Maquiadora", "Cameraman", "Figurinista"};
        listaLugares.add(adicionaLugar("Set de Filmagem", convertStringPersonagem(listPersonagem4)));

        //Faculdade
        String[] listPersonagem5 = new String[] {"Estudante", "Cozinheiro do RU", "Professor", "Técnico de laboratório", "Faxineira", "Aluno que vende docinhos", "Bibliotecário", "Estagiário do professor", "Bixo/Bixete"};
        listaLugares.add(adicionaLugar("Faculdade", convertStringPersonagem(listPersonagem5)));

        //Mercado
        String[] listPersonagem6 = new String[] {"Cliente furtando coisas", "Toguro", "Açougueiro", "Repositor", "Marombeiro", "Cliente", "Entregador", "Gerente", "Caixa"};
        listaLugares.add(adicionaLugar("Mercado", convertStringPersonagem(listPersonagem6)));

        //Egito
        String[] listPersonagem7 = new String[] {"Celebridade", "Faraó", "Celebridade", "Nerfetite (Noiva do Faraó)", "Guia de turismo", "Múmia", "Turista", "Miragem", "Camelo", "Sacerdote"};
        listaLugares.add(adicionaLugar("Egito", convertStringPersonagem(listPersonagem7)));

        //Praia
        String[] listPersonagem8 = new String[] {"Vendedor de sorvete", "Caiçara", "Toguro", "Banhista", "Tartaruga", "Criança Perdida", "Surfista", "Salva Vidas", "Tio do queijinho"};
        listaLugares.add(adicionaLugar("Praia", convertStringPersonagem(listPersonagem8)));

        //Louge Hookah
        String[] listPersonagem9 = new String[] {"Parça", "Caixa", "Recepcionista", "O cara do carvão", "Cliente", "Playboy", "Preparadora de rosh", "Lavador de vaso", "Funkeiro"};
        listaLugares.add(adicionaLugar("Louge Hookah", convertStringPersonagem(listPersonagem9)));

        //Salão de Beleza
        String[] listPersonagem10 = new String[] {"Faxineiro", "Madame", "Namorado aguardando", "Estagiária", "Estilista de cabelo", "Cabeleleira leila", "Cabelereiro", "Manicure", "Dona de salão"};
        listaLugares.add(adicionaLugar("Salão de Beleza", convertStringPersonagem(listPersonagem10)));

        //Petshop
        String[] listPersonagem11 = new String[] {"Veterinárip", "Dono de pet", "Furão", "Papagaio", "Hamister", "Adestrador", "Voluntária a cuidadora", "Luiza Mel (ativista)", "Cachorro"};
        listaLugares.add(adicionaLugar("Petshop", convertStringPersonagem(listPersonagem11)));

        //Funeral
        String[] listPersonagem12 = new String[] {"O perdido, não sabe nem quem é o morto", "Criança", "Padre", "Decorador de flores", "Morcego", "Coveiro", "Morto", "Segurança", "Urubu esperando o morto"};
        listaLugares.add(adicionaLugar("Funeral", convertStringPersonagem(listPersonagem12)));

        //Padaria
        String[] listPersonagem13 = new String[] {"Tiozinho do café", "Bêbado", "Dono da padóca", "Confeiteira", "Entregador", "Padeiro", "Caixa", "Cliente", "Criança que quer doce"};
        listaLugares.add(adicionaLugar("Padaria", convertStringPersonagem(listPersonagem13)));

        //Academia
        String[] listPersonagem14 = new String[] {"Gordinho da esteira", "Frango", "Técnico", "Vendedor de anabolizante", "Fisiculturista", "Panicat", "Dono da academia", "Marombeiro", "Personal trainer"};
        listaLugares.add(adicionaLugar("Academia", convertStringPersonagem(listPersonagem14)));

        //Hospício
        String[] listPersonagem15 = new String[] {"Cuidador", "O louco que está planejando a fuga", "Enfermeiro", "O outro eu do bipolar", "Enfermeira", "Elefante cor de rosa", "Unicórnio Colorido", "O bipolar", "A morte"};
        listaLugares.add(adicionaLugar("Hospício", convertStringPersonagem(listPersonagem15)));

        //Festa de Aniversário
        String[] listPersonagem16 = new String[] {"Pai da aniversariante", "Palhaço", "Aniversariante", "Mãe da aniversariante", "Tio do Pavê", "Namorado da aniversariante", "Decoradora", "Bebê cagado", "Vovó peidorreira"};
        listaLugares.add(adicionaLugar("Festa de Aniversário", convertStringPersonagem(listPersonagem16)));

        //Circo
        String[] listPersonagem17 = new String[] {"Macaco", "Elefante", "Ilusionista", "Malabarista", "Vendedor de pipoca", "Palhaço", "Mimico", "Alguém da plateia", "Domador de leão"};
        listaLugares.add(adicionaLugar("Circo", convertStringPersonagem(listPersonagem17)));

        //Tribo Indígena
        String[] listPersonagem18 = new String[] {"Ativista", "Integrante da tribo", "Cameraman do repórter", "Macaquinho", "Integrante da tribo vizinha", "Repórter visitante", "Criança", "Motorista do repórter", "Cacique"};
        listaLugares.add(adicionaLugar("Tribo Indígena", convertStringPersonagem(listPersonagem18)));

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

    public ArrayList<Lugar> getListaLugares() {
        return this.listaLugares;
    }

    public ArrayList<Personagem> convertStringPersonagem(String[] listaString){
        ArrayList<Personagem> lista = new ArrayList<Personagem>();
        for(int i = 0; i < listaString.length; i++) {
            lista.add(new Personagem(listaString[i]));
        }
        lista.get(0);
        return lista;
    }
}
