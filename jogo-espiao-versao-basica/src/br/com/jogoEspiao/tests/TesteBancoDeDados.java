package br.com.jogoEspiao.tests;

import br.com.jogoEspiao.models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteBancoDeDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BancoDeDados bd = new BancoDeDados();
        ArrayList<Lugar> listLugares = new ArrayList<Lugar>();
        listLugares = bd.getBancoDeDados();
        ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();
        int numeroEspioes = 2;

        try {
            boolean loopingJogoTodo = true;
            while(loopingJogoTodo) {
                boolean loopingMenu = true;
                while(loopingMenu) {
                    GameInterface.menuInterface();
                    switch (sc.nextInt()) {
                        case 1:
                            //implementação de registro de usuários
                            loopingMenu = false;
                            GameUtil.limpaPromptComando();
                            break;
                        case 2:
                            //implementação de jogar()
                            loopingMenu = false;
                            GameUtil.limpaPromptComando();
                            break;
                        case 3:
                            //implementação de configurações de jogo
                            System.out.print("Quantos espiões no jogo? ");
                            numeroEspioes = sc.nextInt();
                            GameUtil.limpaPromptComando();
                    }
                }

                boolean loopingCadastro = true;
                while(loopingCadastro) {
                    if(listaJogadores.isEmpty()){
                        GameInterface.cadastroInterface(listaJogadores);
                        listaJogadores.add(new Jogador(sc.next()));
                        GameUtil.limpaPromptComando();
                    } else {
                        GameUtil.limpaPromptComando();
                        GameInterface.perguntaMaisRegistros(listaJogadores);
                        switch (sc.nextInt()) {
                            case 1:
                                GameUtil.limpaPromptComando();
                                GameInterface.cadastroInterface(listaJogadores);
                                listaJogadores.add(new Jogador(sc.next()));
                                break;
                            case 2:
                                //Jogar
                                GameUtil.limpaPromptComando();
                                loopingCadastro = false;
                                break;
                        }
                    }
                }


                Lugar lugarSorteado = GameUtil.pegaLugarAleatorio(bd);
                bd.getBancoDeDados().remove(lugarSorteado);

                listaJogadores = GameUtil.sorteiaJogadores(listaJogadores);

                listaJogadores = GameUtil.atribuiPersonagens(listaJogadores, lugarSorteado.getListPersonagem(), numeroEspioes);

                listaJogadores = GameUtil.sorteiaJogadores(listaJogadores);

                System.out.println("Pronto para começar? Aperte ENTER...");
                sc.nextLine();
                sc.nextLine();
                GameUtil.limpaPromptComando();
                for (int i = 0; i < listaJogadores.size(); i++) {
                    System.out.println("Passe para o(a): " + listaJogadores.get(i).getNome());
                    System.out.println("Quando estiver pronto(a) para ver quem é você aperte ENTER...");
                    sc.nextLine();
                    if(listaJogadores.get(i).getPersonagem().getNomePersonagem() == "Espião") {
                        System.out.println("Você é espião, descubra onde você está");
                        System.out.println("Para próximo aperte ENTER");
                    } else {
                        System.out.println(listaJogadores.get(i).getNome() + " você está em: " + lugarSorteado.getNomeDoLugar());
                        System.out.println("Seu personagem é: " + listaJogadores.get(i).getPersonagem().getNomePersonagem());
                        System.out.println("Para próximo aperte ENTER");
                    }
                    sc.nextLine();
                    GameUtil.limpaPromptComando();
                }
                System.out.println("Que o jogo começe, para voltar ao menu aperte ENTER...");
                sc.nextLine();
                GameUtil.limpaPromptComando();
            }
        } catch(Exception ex) {
            System.out.println("Acabaram os lugares cadastrados, reinicie o programa");
        }

    }

    public static void imprimeJogadores(ArrayList<Jogador> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNome() + " você é: " + list.get(i).getPersonagem().getNomePersonagem());
        }
    }
}
