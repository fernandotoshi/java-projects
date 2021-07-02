package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com arquivo
        FileInputStream fis = new FileInputStream("lorem.txt"); // Possibilidade de read() return byte em int
        InputStreamReader isr = new InputStreamReader(fis); // Possibilidade de read() preenchendo um char[]
        BufferedReader br = new BufferedReader(isr); // Possibilidade de readLine() em String

        String linha = br.readLine();

        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
}
